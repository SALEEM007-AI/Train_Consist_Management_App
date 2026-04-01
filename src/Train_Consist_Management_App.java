import java.util.LinkedList;

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("====================================");

        // Step 1: Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Step 2: Add initial bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Display initial consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Step 3: Insert Pantry Car at position 2
        train.add(2, "Pantry Car");

        // Display after insertion
        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(train);

        // Step 4: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Display final consist
        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}