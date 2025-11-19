import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean f=true;
        while (f){
            System.out.println("Menu\n1-Logon/Create Account 2-Login/Access Account 3-Exit. Enter choice: ");
            int choice =in.nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    f=false;
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
        }
    }
}