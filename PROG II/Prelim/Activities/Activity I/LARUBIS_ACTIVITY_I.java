import java.util.Scanner;

class LARUBIS_ACTIVITY_I {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.print("Enter a number (0-4) to display the corresponding name: ");
        int index = sc.nextInt();

        if (index >= 0 && index < names.length) {
            System.out.println("The name selected is: " + names[index]);
        } else {
            System.out.println("Invalid number. Please enter a number between 0 and 4.");
        }
    }
}