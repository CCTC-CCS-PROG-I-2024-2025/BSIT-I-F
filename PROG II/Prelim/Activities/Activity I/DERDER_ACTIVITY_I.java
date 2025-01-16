import java.util.Scanner;

 class DERDER_ACTIVITY_I {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 names");

        for (int i = 0; i < names.length; i++) {
            System.out.print("Name" + (i + i) + ": ");
            names[i] = scanner.nextLine();
        }
        System.out.println("\nChoose a number (1 to 5) to display the corresponding name");
        int index = scanner.nextInt();

        if (index >= 1 && index <= 5) {
            System.out.println("Select name: " + names[index - 1]);
        } else {
            System.out.println("Invalid number. Please choose between 1 and 5.");
        }
    }
 }
