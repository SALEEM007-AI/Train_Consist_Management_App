import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("=======================================\n");

        // Create list of bogies
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );

        // Print all bogies
        System.out.println("All Bogies:");
        bogies.forEach(b ->
                System.out.println(b.getType() + " -> " + b.getCapacity())
        );

        // Group bogies by type
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        // Print grouped bogies
        System.out.println("\nGrouped Bogies:\n");

        groupedBogies.forEach((type, list) -> {
            System.out.println("Bogie Type: " + type);
            list.forEach(b ->
                    System.out.println("Capacity -> " + b.getCapacity())
            );
            System.out.println();
        });

        System.out.println("UC9 grouping completed...");
    }
}