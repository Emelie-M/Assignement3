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
                    System.out.println("Choose the user name: ");
                    String username=in.next();
                    try {
                        while (!username.matches("[a-zA-Z]")) {
                            throw new UserCheck();
                        }

                    } catch (UserCheck u) {
                        System.out.println(u);
                        System.out.println("Choose the user name: ");
                        username = in.next();
                    }
                    System.out.println("choose password: ");
                    String pass=in.next();
                    try {
                        if(!pass.matches("[a-zA-Z0-9]")) {
                            throw new PassCheck();
                        }
                    }catch (PassCheck p){
                        System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.println("Enter password: ");
                    String um=in.next();
                    try {

                    }catch (Exception e){

                    }
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