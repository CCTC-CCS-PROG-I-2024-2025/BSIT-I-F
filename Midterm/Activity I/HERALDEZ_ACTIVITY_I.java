import java.util.Scanner;
class HERALDEZ_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Color: ");
            String color = sc.nextLine();
                   switch (color) {
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
