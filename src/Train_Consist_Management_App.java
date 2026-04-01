import java.util.HashSet;
import java.util.Set;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   UC3 - Track Unique Bogie IDs");
        System.out.println("======================================");

        // Initialize HashSet
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        System.out.println("\nAfter Adding Bogie IDs:");
        System.out.println("Bogie IDs : " + bogieIds);

        // Try adding duplicate
        System.out.println("\nAttempting to add duplicate 'BG101':");
        boolean added = bogieIds.add("BG101");

        System.out.println("Was duplicate added? : " + added);

        // Check existence
        System.out.println("\nChecking if 'BG102' exists:");
        System.out.println("Contains BG102? : " + bogieIds.contains("BG102"));

        // Final output
        System.out.println("\nFinal Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nUC3 operations completed successfully...");
    }
}