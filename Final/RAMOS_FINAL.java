import java.util.Scanner;

public class RAMOS_FINAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = 0;

        System.out.println("Welcome to Pizza Delight!");

        System.out.print("Enter how many pizzas would you like to order? ");
        int orderCount = sc.nextInt();

        for (int i = 1; i <= orderCount; i++) {
            System.out.println("\nMenu:");
            System.out.println("1. Margherita Pizza - P299");
            System.out.println("2. Pepperoni Pizza - P349");
            System.out.println("3. Veggie Pizza - P319");
            System.out.println("4. BBQ Chicken Pizza - P369");
            System.out.print("Choose a pizza (1-4): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    totalBill += 299;
                    System.out.println("You ordered a Margherita Pizza.");
                    break;
                case 2:
                    totalBill += 349;
                    System.out.println("You ordered a Pepperoni Pizza.");
                    break;
                case 3:
                    totalBill += 319;
                    System.out.println("You ordered a Veggie Pizza.");
                    break;
                case 4:
                    totalBill += 369;
                    System.out.println("You ordered a BBQ Chicken Pizza.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    i--; // Decrement the counter to repeat the iteration
                    continue;
            }
            System.out.printf("Total so far: P%.2f%n", totalBill);
        }

        // Display the final bill
        System.out.printf("\nYour total bill is: P%.2f%n", totalBill);
        System.out.println("Thank you for dining with us! Enjoy your pizza!");
        sc.close();
    }
}