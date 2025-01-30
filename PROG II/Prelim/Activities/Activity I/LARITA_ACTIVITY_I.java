import java.util.Scanner;

public class LARITA_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = new String[5];

        System.out.println("Please enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number >= 1 && number <= 5) {
            System.out.println(names[number - 1]);
        } else {
            System.out.println("Just stick from 1 to 5 please, thanks!");
        }
    }
}
