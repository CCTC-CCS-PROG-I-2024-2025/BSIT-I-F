import java.util.Scanner;

public class EBARSABAL_FINALS {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Println demonstration
        System.out.println("RHEA EBARSABAL:");
        String name = sc.nextLine();
        System.out.println("18:");
        int age = sc.nextInt();
        // Arithmetic operations
            System.out.println("enter your first number:");
            int num1 = sc.nextInt();
            int num2 = 4;
            System.out.println(num1 + num2);
            //for loop demontration
            System.out.println("pick a number under 100:");
            int num = sc.nextInt();
            for(int i = 1; i <= num; i++){
                System.out.println(i);
            }
            // while loop with multiple conditions
            System.out.println("enter your fav number:");
            int fav = sc.nextInt();
            if ( fav > 50 ) {
                System.out.println("then your a high number enjoyer");
            } else if ( fav < 50 ) {
                System.out.println("you like low numbers");
            }
            // switch case demonstration
            System.out.println("do you like anime?:");
            Scanner sc2 = new Scanner(System.in);
            String anime = sc2.nextLine();
            switch (anime) {
                case "yes":
                    System.out.println("you're awesome");
                    break;
                case "no":
                    System.out.println("damn such a waste");
                    break;
                default:
                    System.out.println("you are a neutral person");
                    break;
            }
    }
}