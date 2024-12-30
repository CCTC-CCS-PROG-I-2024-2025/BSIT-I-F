import java.util.Scanner;

class ROSAPA_FINAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0; // Initial balance
        int choice;

        do {
            System.out.println("\nSimple Banking System");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear invalid input
                    }
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount; // Using += operator
                        System.out.println("Successfully deposited: $" + depositAmount);
                    } else {
                        System.out.println("Deposit amount must be positive.");
                    }
                    break;

                case 2: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear invalid input
                    }
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount; // Using -= operator
                        System.out.println("Successfully withdrew: $" + withdrawAmount);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds. Your balance is: $" + balance);
                    } else {
                        System.out.println("Withdrawal amount must be positive.");
                    }
                    break;

                case 3: // Check Balance
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 4: // Exit
                    System.out.println("Exiting the banking system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 4); 
        
        scanner.close(); 
    }
}