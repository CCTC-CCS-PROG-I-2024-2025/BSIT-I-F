import java.util.Scanner;
 class HERALDEZ_FINAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();

                    if (choice == 4 && num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        double result = 0;
                        switch (choice) {
                            case 1:
                                result = num1 + num2;
                                break;
                            case 2:
                                result = num1 - num2;
                                break;
                            case 3:
                                result = num1 * num2;
                                break;
                            case 4:
                                result = num1 / num2;
                                break;
                        }
                        System.out.println("The result is: " + result);
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-5).");
            }
            System.out.println();
        }
        scanner.close();
    }
}
