import java.util.Scanner;
    class CABARDO_ACTIVITY_IV{
        public static void main (String[] args){
            Scanner sc= new Scanner (System.in);
            System.out.println("enter a non-negative integer");
            int number= sc.nextInt();
            
            int factorial=1;

            for (int i=1;i<=number;i++){
                factorial*=i;
            }
            System.out.println("Factorial of"+ number + "is" + factorial);
        }
    }