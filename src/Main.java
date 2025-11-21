import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean f=true;
        boolean user=true;
        boolean passw=true;
        while (f){
            System.out.println("Menu\n1-Logon/Create Account 2-Login/Access Account 3-Exit. Enter choice: ");
            int choice =in.nextInt();
            switch (choice){
                case 1:
                    try {
                        while (user) {
                            System.out.println("Choose the user name: ");
                            String username=in.next();
                            if(!username.matches("[a-zA-Z]")){
                                throw new UserCheck();
                            }
                            else{
                                user=false;
                            }
                        }
                    } catch (UserCheck u) {
                        System.out.println(u);
                    }
                    try {
                        while (passw){
                            System.out.println("choose password: ");
                            String pass=in.next();
                            if(!pass.matches("[a-zA-Z0-9]")) {
                                throw new PassCheck();
                            }
                            else {
                                passw=false;
                            }
                        }
                    }catch (PassCheck p){
                        System.out.println(p);
                    }
                    System.out.println("Enter the first hint: ");
                    System.out.println("Enter the answer to the first hint: ");
                    System.out.println("Enter the second hint: ");
                    System.out.println("Enter the answer to the second hint: ");
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