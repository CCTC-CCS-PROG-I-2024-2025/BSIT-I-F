import java.util.Scanner ;
class PALEN_ACTIVITY_IV {
public static void main(String[]args){
  int num;
        int factorial = 1;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextInt();
        for(i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}