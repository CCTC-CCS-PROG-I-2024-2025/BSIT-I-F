import java.util.Scanner;

public class CASTOLO_FINALS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totBill = 0;

        System.out.println("Welcome to Racdonalds!");

        System.out.print("Enter how many items would you like to order? ");
        int orderCount = sc.nextInt();

        for (int i = 1; i <= orderCount; i++) {
            System.out.println("Menu:");
            System.out.println("1. Big Mac - P171");
            System.out.println("2. Egg McMuffin -  P70");
            System.out.println("3. Chicken Meal 1pc - P99");
            System.out.println("4. French Fries  - P83");
            System.out.println("5. Chicken McNuggets 10pc - P175");
            System.out.println("6. Filet O Fish Meal - P145");
            System.out.println("7. Mcflurry - P66");
            System.out.println("8. Softdrink - P65");
            System.out.println("9. Coke McFloat - P79");
            System.out.println("10. Rice - P25");
            System.out.print("Choose an item (1-10):");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    totBill += 171;
                    System.out.println("You ordered a Big Mac.");
                    break;
                case 2:
                    totBill += 70;
                    System.out.println("You ordered a Egg McMuffin.");
                    break;
                case 3:
                    totBill += 99;
                    System.out.println("You ordered a Chicken Meal 1pc.");
                    break;
                case 4:
                    totBill += 83;
                    System.out.println("You ordered a French Fries. ");
                    break;
                case 5:
                    totBill += 175 ;
                    System.out.println("You ordered a Chicken McNuggets 10pc.");
                    break;
                 case 6:
                    totBill += 145;
                    System.out.println("You ordered a Filet O Fish Meal.");
                    break;
                case 7:
                    totBill += 66 ;
                    System.out.println("You ordered a Mcflurry.");
                    break;
                case 8:
                    totBill += 65 ;
                    System.out.println("You ordered a Softdrink.");
                    break;
                 case 9:
                    totBill += 79 ;
                    System.out.println("You ordered a Coke McFloat.");
                    break;
                case 10:
                    totBill += 25;
                    System.out.println("You ordered a Rice.");
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
