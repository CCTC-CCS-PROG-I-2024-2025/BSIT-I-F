public class MEJIA_ACTIVITY_IV {
    public static void main(String[] args) {
        String name = "The sum would be: ";
        String name1 = "The difference would be: ";
        String name2 = "The quotient would be: ";
        String name3 = "The product would be: ";
//VARIABLE
        int x = 14;
        int y = 3;
        int c = 8;
//ADDITION
        int result = x + y;
//SUBTRACTION
        int result1 = y - x;
        if (x > y) {
                result1 = x - y; 
        }else{
        }
//DIVIDE
        int result2 = x / c;
//MULTIPLICATION
        int result3 = c * y;
//PRINTING
        System.out.println(name + result);
        System.out.println(name1 + result1);
        System.out.println(name2 + result2);
        System.out.println(name3 + result3);
            }
}