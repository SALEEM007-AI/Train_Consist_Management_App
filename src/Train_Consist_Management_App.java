// Custom Exception for domain-specific error handling
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie class with Fail-Fast validation logic
class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        // Business Rule: Capacity must be > 0
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie Type: " + type + ", Capacity: " + capacity;
    }
}

// Main Application to demonstrate the Use Case scenarios
public class Train_Consist_Management_App {
    public static void main(String[] args) {
        System.out.println("--- Train Consist Management App: UC14 ---");

        // Scenario 1: Valid Capacity
        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("SUCCESS: " + sleeper);
        } catch (InvalidCapacityException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Scenario 2: Negative Capacity (Expected to fail)
        try {
            System.out.println("\nAttempting to create bogie with capacity -10...");
            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("CAUGHT EXCEPTION: " + e.getMessage());
        }

        // Scenario 3: Zero Capacity (Expected to fail)
        try {
            System.out.println("\nAttempting to create bogie with capacity 0...");
            PassengerBogie zeroBogie = new PassengerBogie("First Class", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("CAUGHT EXCEPTION: " + e.getMessage());
        }
    }
}