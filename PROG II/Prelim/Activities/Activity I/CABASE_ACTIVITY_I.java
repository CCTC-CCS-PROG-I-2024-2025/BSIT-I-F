import java.util.Scanner;

class CABASE_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 names:");

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        System.out.println("\nChoose a number (1 to 5) to display the corresponding name:");
        int index = sc.nextInt();

        if (index >= 1 && index <= 5) {
            System.out.println("Selected name: " + names[index - 1]);
        } else {
            System.out.println("Invalid number. Please choose between 1 and 5.");
        }
    }
}