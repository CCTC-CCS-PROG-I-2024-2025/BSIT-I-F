import java.util.Scanner;
public class TOQUERO_ACTIVITY_I{
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name 1:");
        String name1 = input.nextLine();
        System.out.println("Enter Name 2:");
        String name2 = input.nextLine();
        System.out.println("Enter Name 3:");
        String name3 = input.nextLine();
        System.out.println("Enter Name 4:");
        String name4 = input.nextLine();
        System.out.println("Enter Name 5:");
        String name5 = input.nextLine();
        names[0] = name1;
        names[1] = name2;
        names[2] = name3;
        names[3] = name4;
        names[4] = name5; 

        System.out.println("What name you want to display: ");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println(names[0]);
                break;
            case 2:
                System.out.println(names[1]);
                break;
            case 3:
                System.out.println(names[2]);
                break;
            case 4:
                System.out.println(names[3]);
                break;
            case 5:
                System.out.println(names[4]);
                break;
           
        }



    }
}