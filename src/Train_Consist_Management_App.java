import java.util.Arrays;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() { return type; }
    public String getCargo() { return cargo; }
}

public class Train_Consist_Management_App {
    public static void main(String[] args) {
        // 1. User prepares a list of goods bogies
        List<GoodsBogie> goodsBogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal"),
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Grain")
        );

        // 2. System converts the list into a stream
        // 3. allMatch() checks every bogie against safety rules
        // 4. Conditional logic verifies cylindrical bogie cargo (Cylindrical -> only Petroleum) [cite: 1]
        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie -> {
                    if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                        return bogie.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true; // Non-cylindrical bogies pass this specific rule [cite: 1]
                });

        // 5. If all checks pass, the train is marked safe [cite: 1]
        // 6. Result is displayed to the user [cite: 1]
        if (isSafe) {
            System.out.println("Validation Result: true");
            System.out.println("The train is safety compliant.");
        } else {
            System.out.println("Validation Result: false");
            System.out.println("The train is NOT safety compliant. Rule Violation: Cylindrical bogies must only carry Petroleum.");
        }
    }
}