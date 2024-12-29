import java.util.Scanner;

public class GILHANG_FINAL {
    public static void main(String[] args) {
     
        String studentName; 
        String studentBirthdate; 
        int studentID; 
        int userPoints = 0;
        int mathResult = 0;
        String grade = "";

        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter your name: ");
        studentName = scanner.nextLine(); 

        System.out.print("Enter your birthdate: ");
        studentBirthdate = scanner.nextLine(); 

        System.out.print("Enter your student ID: ");
        studentID = scanner.nextInt(); 

        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Student Birthdate: " + studentBirthdate);
        System.out.println("Student ID: " + studentID);

        // Input user points and calculate results
        System.out.print("Enter your points (1-100): ");
        userPoints = scanner.nextInt();

        if (userPoints >= 1 && userPoints <= 100) {
            mathResult = userPoints * 2;
            System.out.println("Math Result: " + mathResult);

            // Calculate grade based on points
            if (userPoints >= 90) {
                grade = "A";
            } else if (userPoints >= 80) {
                grade = "B";
            } else if (userPoints >= 70) {
                grade = "C";
            } else if (userPoints >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid points. Please enter a value between 1 and 100.");
        }

        // Determine grade level
        int gradeLevel = userPoints / 10;
        switch (gradeLevel) {
            case 10:
            case 9:
                System.out.println("Grade Level: Excellent");
                break;
            case 8:
                System.out.println("Grade Level: Good");
                break;
            case 7:
                System.out.println("Grade Level: Fair");
                break;
            case 6:
                System.out.println("Grade Level: Poor");
                break;
            default:
                System.out.println("Grade Level: Failing");
                break;
        }

        // Print numbers from 1 to 10
        System.out.println("\nPrinting numbers from 1 to 10 (for loop):");
        for (int j = 1; j <= 10; j++) {
            System.out.println("Number: " + j);
        }

        // Basic math operations
        System.out.println("\nBasic Math Operations:");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int operation = scanner.nextInt();

        double result = 0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Result of Addition: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result of Subtraction: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result of Multiplication: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result of Division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please select a valid option.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}