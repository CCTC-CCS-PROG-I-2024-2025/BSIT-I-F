import java.util.Scanner;

public class MEJIA_FINALS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totBill = 0;

        System.out.println("Welcome to Angel Burgers!");

        System.out.print("Enter how many items would you like to order? ");
        int orderCount = sc.nextInt();

        for (int i = 1; i <= orderCount; i++) {
            System.out.println("\nMenu:");
            System.out.println("1. Sulit Burger - P39");
            System.out.println("2. Chicken-wich - P49");
            System.out.println("3. Ultimate Burger - P59");
            System.out.println("4. Cheesy Hotdog - P49");
            System.out.print("Choose an item (1-4): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    totBill += 39;
                    System.out.println("You ordered a Sulit Burger.");
                    break;
                case 2:
                    totBill += 49;
                    System.out.println("You ordered a Chicken-wich.");
                    break;
                case 3:
                    totBill += 59;
                    System.out.println("You ordered a Ultimate Burger.");
                    break;
                case 4:
                    totBill += 49;
                    System.out.println("You ordered a Cheesy Hotdog.");
                    break;
                default:
                    System.out.println("Invalid choice. Skipping this order.");
                    i--;
                    continue;
            }
            System.out.printf("Total so far: P%.2f%n", totBill);
        }

        // This code will display the final bill
        System.out.printf("\nYour total bill is: P%.2f%n", totBill);
        System.out.println("Thank you for your order! Have a great day!");
        sc.close();
    }
}