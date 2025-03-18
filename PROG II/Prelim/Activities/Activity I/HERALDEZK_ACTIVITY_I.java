import java.util.Scanner;

public class HERALDEZ_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter 5 names: ");

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("Choose a number (0 to 4) to display the corresponding name: ");
        int index = sc.nextInt();

        if (index >= 0 && index <= 4) {
            System.out.println("Selected name: " + names[index]);
        } else {
            System.out.println("Invalid number! Please choose from 0 to 4!");
        }
    }
}
