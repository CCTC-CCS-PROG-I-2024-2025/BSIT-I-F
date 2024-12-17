import java.util.Scanner;

public class ResultTrackingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0; // Initialize result
        int choice;

        do {
            System.out.println("\nSimple Calculator with Result Tracking");
            System.out.println("Current Result: " + result);
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Reset Result");
            System.out.println("6. Exit");
            System.out.print("Choose an operation (1-6): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double num;
            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter number to add: ");
                    num = getValidNumber(scanner);
                    result += num; // Using += operator
                    System.out.println("Result after addition: " + result);
                    break;

                case 2: // Subtraction
                    System.out.print("Enter number to subtract: ");
                    num = getValidNumber(scanner);
                    result -= num; // Using -= operator
                    System.out.println("Result after subtraction: " + result);
                    break;

                case 3: // Multiplication
                    System.out.print("Enter number to multiply: ");
                    num = getValidNumber(scanner);
                    result *= num; // Using *= operator
                    System.out.println("Result after multiplication: " + result);
                    break;

                case 4: // Division
                    System.out.print("Enter number to divide: ");
                    num = getValidNumber(scanner);
                    if (num != 0) {
                        result /= num; // Using /= operator
                        System.out.println("Result after division: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 5: // Reset Result
                    result = 0.0; // Resetting the result
                    System.out.println("Result has been reset to 0.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }
        } while (true); // Loop until the user decides to exit

        scanner.close(); // Close the scanner
    }

    // Method to get a valid number input
    private static double getValidNumber(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextDouble();
    }
}