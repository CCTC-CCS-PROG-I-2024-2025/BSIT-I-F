import java.util.Scanner;

public class TOQUERO_FINALS {
    public static void main(String[] args) {
        // Multiple Statement and Variables
        String userName;
        int cartItems = 0;
        double totalPrice = 0.0;
        boolean shopping = true;

        // Taking User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Online Shopping System!");
        System.out.print("Enter your name: ");
        userName = sc.nextLine();

        // Loop to simulate shopping
        while (shopping) {
            // Menu using Switch Statement
            System.out.println("\nHello " + userName + "! Choose an option:");
            System.out.println("1. Add item to cart");
            System.out.println("2. View cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Add item
                    System.out.print("Enter item price: $");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    // Doing Math
                    totalPrice += price * quantity;
                    cartItems += quantity;
                    System.out.println(quantity + " item(s) added to cart!");
                    break;

                case 2: // View cart
                    // Using Conditionals
                    if (cartItems > 0) {
                        System.out.println("Items in cart: " + cartItems);
                        System.out.println("Total price: $" + totalPrice);
                    } else {
                        System.out.println("Your cart is empty.");
                    }
                    break;

                case 3: // Checkout
                    if (cartItems > 0) {
                        System.out.println("Checking out...");
                        System.out.println("Total items: " + cartItems);
                        System.out.println("Total price: $" + totalPrice);
                        System.out.println("Thank you for shopping with us!");
                        shopping = false; // End shopping
                    } else {
                        System.out.println("Your cart is empty. Add items first!");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting the system. Have a great day!");
                    shopping = false;
                    break;

                default: // Invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // For Loop example: Thanking user
        System.out.print("\nThank you");
        for (int i = 0; i < 3; i++) {
            System.out.print("!");
        }
        System.out.println();

        sc.close(); // Close scanner
    }
}