import java.util.Scanner;

public class ALQUEZA_FINAL {

    public static void main(String[] args) {
        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        String studentName;
        int studentAge;
        int numSubjects;
        double[] subjectScores;
        double totalScore = 0;
        char grade;

        // Get student information
        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter student age: ");
        studentAge = scanner.nextInt();

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        // Create an array to store subject scores
        subjectScores = new double[numSubjects];

        // Get subject scores from the user
        System.out.println("Enter scores for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectScores[i] = scanner.nextDouble();
            totalScore += subjectScores[i];
        }

        // Calculate average score
        double averageScore = totalScore / numSubjects;

        // Determine the grade
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Print student information and grade
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}