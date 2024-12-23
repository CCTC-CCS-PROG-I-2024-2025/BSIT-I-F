import java.util.Scanner;

 class CABASE_FINAL {
    public static void main(String[] args) {
        // Parts names and prices
        String[] parts = {"Mouse pad Red - ₱1,000.00", "ASUS Monitor 144hz - ₱3,955.00", "RYZEN 5 PRO 4560G - ₱10,000.00", "Gaming Case - 1,500.00", "Keyboard W/ RGB lights - ₱3,658.00"};
        double[] prices = {1000.00, 3955.00, 13000.00, 1500.00, 3658.00};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message and menu display
        System.out.println("Welcome to the COMZONE Shop!");
        System.out.println("Here is our menu parts:");
        for (int i = 0; i < parts.length; i++) {
            System.out.println((i + 1) + ". " + parts[i]);
        }

        // Variables for tracking the order
        double totalPrice = 0.0;
        StringBuilder orderDetails = new StringBuilder();
        boolean ordering = true;

        // Start ordering parts
        while (ordering) {
            System.out.print("\nEnter the number (1-5), or 0 to finish: ");
            int choice = scanner.nextInt();

            // Use switch statement for handling user choice
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    totalPrice += prices[choice - 1];
                    orderDetails.append(parts[choice - 1]).append("\n");
                    System.out.println(parts[choice - 1] + " added to your order.");
                    break;

                case 0:
                    ordering = false;
                    System.out.println("\nThank you for your order!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            // Discount feature: Apply a 10% discount for orders over ₱100,000
            if (totalPrice > 100000.00) {
                System.out.println("\nCongratulations! You've earned a 10% discount.");
                totalPrice *= 0.9; // Apply discount
                break; // Exit ordering loop after applying discount
            }
        }

        // Bonus feature: Freebies USBsandisk for orders over ₱50 but under ₱100,000
        if (totalPrice > 50.00 && totalPrice <= 100000.00) {
            System.out.println("\nFreebies! You get a free USB!");
            orderDetails.append("USBsandisk 64GB - ₱0.00 (Freebies)\n");
        }

        // Display order summary
        if (orderDetails.length() > 0) {
            System.out.println("\nYour order:");
            System.out.println(orderDetails.toString());
            System.out.printf("Total price: ₱%.2f\n", totalPrice);
        } else {
            System.out.println("No items were ordered.");
        }

        System.out.println("Have a nice day!");
        scanner.close();
    }
}