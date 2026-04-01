import java.util.LinkedHashSet;

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("====================================");

        // Step 1: Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 2: Add bogies (including duplicate)
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");
        train.add("Sleeper"); // duplicate

        // Step 3: Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        // Note
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}