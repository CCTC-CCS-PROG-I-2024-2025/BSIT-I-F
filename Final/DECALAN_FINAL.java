import java.util.Scanner;

public class DECALAN_FINAL {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            System.out.println("Hello! Welcome to the Number Analyzer Program!");
            
            System.out.println();
            System.out.print("What's your name? ");
            String userName = scanner.nextLine();
            
            int userNumber;
            
            while (true) {
                System.out.print("Hi " + userName + "! Enter a number between 1 and 100: ");
                userNumber = scanner.nextInt();
                
                if (userNumber >= 1 && userNumber <= 100) {
                    break;
                } else {
                    System.out.println("Oops! That’s not allowed. Please pick a number between 1 and 100.");
                }
            }
            
            System.out.println("Thanks, " + userName + "! You chose " + userNumber + ".");
            
            if (userNumber < 50) {
                System.out.println("Looks like your number is less than 50.");
            } else {
                System.out.println("Your number is 50 or greater. Cool!");
            }
            
            // Check if the number is odd or even
            if (userNumber % 2 == 0) {
                System.out.println("Also, " + userNumber + " is an EVEN number.");
            } else {
                System.out.println("And guess what? " + userNumber + " is an ODD number.");
            }
            
            // Calculate the sum and average
            int sum = 0;
            for (int i = 1; i <= userNumber; i++) {
                sum += i;
            }
            
            double average = (double) sum / userNumber;
            
            System.out.println("The sum of all numbers from 1 to " + userNumber + " is: " + sum);
            System.out.printf("The average of numbers from 1 to " + userNumber + " is: %.2f%n", average);
            
            System.out.println("That’s it for now, " + userName + "! Thanks for trying out this program!");
            System.out.println("Goodbye! Happy New Year!");
        }
    }
}
