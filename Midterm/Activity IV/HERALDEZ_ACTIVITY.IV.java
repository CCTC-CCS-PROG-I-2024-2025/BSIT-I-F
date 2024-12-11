import java.util.Scanner;
class HERALDEZ_ACTIVITY_IV {
    public static void main(String []args){
       int num;
       int factorial = 1;
       int i;
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter non-negative integer");
        num = sc.nextInt();
        for (i = 1; i <= num; i++){
            factorial *= i;
            System.out.println("1" +num+"="+factorial);
        }
    }
        
}
        