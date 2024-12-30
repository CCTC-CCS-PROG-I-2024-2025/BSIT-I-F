import java.util.Scanner;

class SCHWARTZ_FINAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName;
        int studentID;
        int hciPoints, comp1Points, precalPoints, programmingPoints;
        float gwa;

        System.out.print("Enter your name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter your student ID: ");
        studentID = scanner.nextInt();

        System.out.print("Enter your HCI points (1-100): ");
        hciPoints = scanner.nextInt();

        System.out.print("Enter your Comp 1 points (1-100): ");
        comp1Points = scanner.nextInt();

        System.out.print("Enter your Precal points (1-100): ");
        precalPoints = scanner.nextInt();

        System.out.print("Enter your Programming points (1-100): ");
        programmingPoints = scanner.nextInt();

        float hciWeight = 0.3f, comp1Weight = 0.2f, precalWeight = 0.2f, programmingWeight = 0.3f;

        gwa = (hciPoints * hciWeight) + (comp1Points * comp1Weight) +
              (precalPoints * precalWeight) + (programmingPoints * programmingWeight);

       
        System.out.println("\nYour General Weighted Average (GWA): " + String.format("%.2f", gwa));
        if (gwa >= 90) {
            System.out.println("Grade Level: Excellent");
        } else if (gwa >= 80) {
            System.out.println("Grade Level: Good");
        } else if (gwa >= 70) {
            System.out.println("Grade Level: Fair");
        } else {
            System.out.println("Grade Level: Needs Improvement");
        }

        System.out.println("\nMotivational Quote for a Programmer: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("\"The best way to predict the future is to invent it.\" - Alan Kay");
        }

        System.out.println("Printing numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nSubjects you entered points for:");
        String[] subjects = {"HCI", "Comp 1", "Precal", "Programming"};
        int[] points = {hciPoints, comp1Points, precalPoints, programmingPoints};

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + points[i] + " points");
        }

        scanner.close();
    }
}