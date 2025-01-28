import java.util.Scanner;

public class YBANEZ_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = new String[5];

        System.out.println("Please enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Kind stranger, please enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("Enter a number:");
        int number = sc.nextInt();


        System.out.println(names[number - 1]);
        
        sc.close();
    }
}