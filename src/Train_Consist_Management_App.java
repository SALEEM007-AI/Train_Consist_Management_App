import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

public class Train_Consist_Management_App {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("====================================");

        // Step 1: Create List
        List<Bogie> list = new ArrayList<>();

        // Step 2: Add bogies
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("General", 90));

        // Step 3: Print BEFORE sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : list) {
            System.out.println(b);
        }

        // Step 4: Sort using Comparator (ascending)
        list.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 5: Print AFTER sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : list) {
            System.out.println(b);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}