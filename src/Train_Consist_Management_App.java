import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Train_Consist_Management_App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Define Regex Patterns
        // Train ID: TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // Cargo Code: PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile Patterns
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        System.out.println("--- Train ID & Cargo Code Validation ---");

        // Validate Train ID
        System.out.print("Enter Train ID (e.g., TRN-1234): ");
        String trainIdInput = scanner.nextLine();
        validateInput(trainIdInput, trainIdPattern, "Train ID");

        // Validate Cargo Code
        System.out.print("Enter Cargo Code (e.g., PET-AB): ");
        String cargoCodeInput = scanner.nextLine();
        validateInput(cargoCodeInput, cargoCodePattern, "Cargo Code");

        scanner.close();
    }

    private static void validateInput(String input, Pattern pattern, String fieldName) {
        // 3. Use Matcher to check input
        Matcher matcher = pattern.matcher(input);

        // 4. Verification using matches() for exact string match
        if (matcher.matches()) {
            System.out.println("✔ " + fieldName + " [" + input + "] is VALID.");
        } else {
            System.out.println("❌ " + fieldName + " [" + input + "] is INVALID.");
            System.out.println("   (Requirement: " + getRequirement(fieldName) + ")");
        }
    }

    private static String getRequirement(String fieldName) {
        if (fieldName.equals("Train ID")) return "TRN- followed by 4 digits (e.g., TRN-1234)";
        return "PET- followed by 2 uppercase letters (e.g., PET-AB)";
    }
}