import java.util.Scanner;

class MIGALLEN_ACTIVITY_I {
    public static void main(String[] args) {
        String[] names = {
            "Genmar Bragais",
            "Alan Walker",
            "Kurt Fake",
            "Jhon Nino",
            "Feil Jhon"
        };

        System.out.println("Here are the names:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        int selectedNumber = 3;

        System.out.println("\nSelected name: " + names[selectedNumber - 1-5]);
    }
}