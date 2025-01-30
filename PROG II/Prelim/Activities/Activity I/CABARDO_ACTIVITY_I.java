import java.util.Scanner;

class CABARDO_ACTIVITY_I{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String [5];
        
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name" + (i + 1) + ":");
            names[i] = sc.nextLine();
        }
        System.out.println("\nChoose a number to display the corresponding name:");
        int index = sc.nextInt();
        
        if (index >= 0 && index <= 4) {
            System.out.println("Selected name: " + names[index - 1]);
        }
    }
}