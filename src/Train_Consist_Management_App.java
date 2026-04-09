// 1. Custom Runtime Exception for Cargo Safety
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;
    private String cargoType;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // 2. Logic to validate and assign cargo
    public void assignCargo(String cargo) {
        System.out.println("Attempting to assign " + cargo + " to a " + shape + " bogie...");

        try {
            // Check for unsafe combination: Petroleum in Rectangular bogie
            if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("SAFETY VIOLATION: Cannot assign Petroleum to a Rectangular bogie!");
            }

            this.cargoType = cargo;
            System.out.println("SUCCESS: " + cargo + " assigned successfully.");

        } catch (CargoSafetyException e) {
            // 3. Catch the exception and display error
            System.err.println("CATCH BLOCK: " + e.getMessage());

        } finally {
            // 4. Finally block for cleanup/logging [cite: 1]
            System.out.println("FINALLY BLOCK: Cargo assignment validation process completed.");
            System.out.println("--------------------------------------------------");
        }
    }
}

public class Train_Consist_Management_App {
    public static void main(String[] args) {
        System.out.println("--- Train Consist Management App: UC15 ---");

        // Test Case 1: Safe Assignment (Cylindrical + Petroleum) [cite: 1]
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");
        cylindricalBogie.assignCargo("Petroleum");

        // Test Case 2: Unsafe Assignment (Rectangular + Petroleum) [cite: 1]
        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        rectangularBogie.assignCargo("Petroleum");

        // Test Case 3: Program continuation [cite: 1]
        System.out.println("Program continues to run safely after handling exceptions.");
    }
}