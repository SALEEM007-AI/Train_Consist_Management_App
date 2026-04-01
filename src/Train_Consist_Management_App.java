import java.util.HashMap;

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("====================================");

        // Step 1: Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Step 2: Insert bogie-capacity mapping
        map.put("First Class", 24);
        map.put("Cargo", 120);
        map.put("Sleeper", 72);
        map.put("AC Chair", 56);

        // Step 3: Display in required format
        System.out.println("\nBogie Capacity Details:");
        System.out.println("First Class -> " + map.get("First Class"));
        System.out.println("Cargo -> " + map.get("Cargo"));
        System.out.println("Sleeper -> " + map.get("Sleeper"));
        System.out.println("AC Chair -> " + map.get("AC Chair"));

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}