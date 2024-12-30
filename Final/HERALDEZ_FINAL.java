import java.util.Scanner;

public class HERALDEZ_FINAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             
        String customerName = "";
        int orderQuantity = 0;
        double totalPrice = 0.0;
        int choice = 0; 
        
        System.out.println("Welcome to Tasty Treats Café!");
                
        System.out.print("Enter your name: ");
        customerName = scanner.nextLine();
        
        System.out.print("How many items would you like to order? (Enter quantity): ");
        orderQuantity = scanner.nextInt();
        scanner.nextLine(); 
        
        double pricePerItem = 0.0;
        if (orderQuantity > 0) {
            System.out.println("Tasty Treats Café Menu:");
            System.out.println("1. Chocolate Cake: $5.99");
            System.out.println("2. Coffee: $2.49");
            System.out.println("3. Sandwich: $7.99");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    pricePerItem = 5.99;
                    break;
                case 2:
                    pricePerItem = 2.49;
                    break;
                case 3:
                    pricePerItem = 7.99;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return; 
            }
            
            totalPrice = orderQuantity * pricePerItem;
            System.out.println("Total price: $" + totalPrice);
        } else {
            System.out.println("Please enter a valid quantity.");
            return; 
        }
        
        boolean confirmed = false;
        while (!confirmed) {
            System.out.print("Confirm your order? (yes/no): ");
            String confirmInput = scanner.nextLine();
            if (confirmInput.equalsIgnoreCase("yes")) {
                confirmed = true;
                System.out.println("Order confirmed! Enjoy your meal, " + customerName + ".");
            } else if (confirmInput.equalsIgnoreCase("no")) {
                System.out.println("Order cancelled.");
                confirmed = true;
            } else {
                System.out.println("Please enter 'yes' or 'no'.");
            }
        }
        
        System.out.println("Order Details:");
        for (int i = 0; i < orderQuantity; i++) {
            System.out.println("Item: " + (choice == 1 ? "Chocolate Cake" : choice == 2 ? "Coffee" : "Sandwich"));
        }
        
        System.out.println("Thank you for visiting Tasty Treats Café!");
    }
}