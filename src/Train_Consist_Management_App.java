import java.util.Arrays;
import java.util.List;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        // Step 1: Create a list of Bogie objects
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 72)
        );

        // Step 2: Display Header
        System.out.println("=======================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("=======================================\n");

        // Step 3: Display Bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.type + " -> " + b.capacity);
        }

        // Step 4: Calculate total using Stream
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // Step 5: Display total
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        // Step 6: Completion message
        System.out.println("\nUC10 aggregation completed...");
    }
}