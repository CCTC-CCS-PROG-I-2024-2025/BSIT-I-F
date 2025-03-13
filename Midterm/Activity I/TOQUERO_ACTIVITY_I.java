import java.util.Scanner;

class TOQUERO_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color:");
        String Color = sc.nextLine();

        switch (Color) {
            case "red":
                System.out.println(1);
                break;
            case "green":
                System.out.println(2);
                break;
            case "black":
                System.out.println(3);
                break;

        }

    }

}