import java.util.Scanner;

public class FLORES_ACTIVITY_IV{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int number = sc.nextInt();

        if(number<0){
            System.out.println("Please enter a non-negative integer.");
        }else{
            
            int factorial = 1;

            for(int i = 1;i<= number;i++){
                factorial*=i;
                System.out.println("The factorial of"+number+"is:"+ factorial);
            }
            
        
        }
    }
}