import java.util.Scanner;

class MENDOZA_FINALS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        char operator;
        boolean validOperation = false;


        //Loop to allow multiple calculations 
        do {
            System.out.println("Enter the first number:");
            num1 = input.nextInt();

            System.out.println("Enter the operator(+,-,*,/):");
            operator = input.next().charAt(0);

            System.out.println("Enter the second number:");
            num2 = input.nextInt();

            //Loop to validate the operator
            for (int i = 0; i < 3; i++) {
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    validOperation = true;
                    break;
                } else {
                    System.out.println("Invalid operator. Please enter a valid operator.");
                    System.out.println("Enter the operator(+,-,*,/");
                    operator = input.next().charAt(0);
                }
            }
            if (validOperation) {
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error:Division by zero is not allowed.");
                            result = 0;
                        }
                        break;
                    default:
                        result = 0;
                }

                System.out.println(num1 + "" + operator + "" + num2 + "=" + result);
            }
        } while (askUserToContinue(input));

        System.out.println("Thank you for using this simple calculator!");
    }

    private static boolean askUserToContinue(Scanner input) {
        char choice;
        do {
            System.out.println("Do you want to continue (y/n)?");
                choice = input.next().charAt(0);
            }
            while (choice != 'y' && choice != 'n');
            return choice == 'y';
        }
    }