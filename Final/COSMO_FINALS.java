import java.util.Scanner; // Import the Scanner class for user input

public class COSMO_FINALS {

    // Main method - Entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variable declarations and initializations
        int number;
        String name;
        double average;

        // Display a welcome message
        System.out.println("Welcome to the Java Program!");

        // Take user input
        System.out.print("Enter your name: ");
        name = scanner.nextLine(); // Input for string

        System.out.print("Enter a number between 1 and 100: ");
        number = scanner.nextInt(); // Input for integer

        // Conditional statements
        if (number < 50) {
            System.out.println("Hi, " + name + ". Your number is less than 50.");
        } else {
            System.out.println("Hi, " + name + ". Your number is 50 or greater.");
        }

        // Switch statement
        switch (number % 2) {
            case 0: // Multiple condition case: if number is even
                System.out.println("Your number is even.");
                break;
            case 1:
                System.out.println("Your number is odd.");
                break;
            default:
                System.out.println("Unexpected error!");
        }

        // While loop: calculate the sum of all numbers from 1 to the entered number
        int sum = 0;
        int counter = 1;
        while (counter <= number) {
            sum += counter;
            counter++;
        }
        System.out.println("The sum of numbers from 1 to " + number + " is: " + sum);

        // For loop: calculate the average of the first n numbers
        int total = 0;
        for (int i = 1; i <= number; i++) {
            total += i;
        }
        average = (double) total / number;
        System.out.printf("The average of numbers from 1 to %d is: %.2f\n", number, average);

        // Closing the scanner
        scanner.close();

        // End of program
        System.out.println("Thank you for using the program, " + name + "! Goodbye!");
    }
}