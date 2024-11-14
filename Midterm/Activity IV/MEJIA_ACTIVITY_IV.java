import java.util.Scanner;

public class MEJIA_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer:");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Not a non-negative integer.");
        } else {

            int fact = 1;

            for (int i = 1; i <= number; i++) {
                fact *= i;
                System.out.println(fact);
            }
        }
    }
}
