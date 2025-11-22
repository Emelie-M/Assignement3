import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Profile>  profiles = new ArrayList<>();
        String username, pass;
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
                            username=in.next();
                            if(!username.matches("[a-zA-Z]")){
                                throw new UserCheck();
                            }
                            else{
                                user=false;
                                try {
                                    while (passw){
                                        System.out.println("choose password: ");
                                        pass=in.next();
                                        if(!pass.matches("[a-zA-Z0-9]")) {
                                            throw new PassCheck();
                                        }
                                        else {
                                            passw=false;
                                            System.out.println("Enter the first hint: ");
                                            String hint1= in.next();
                                            System.out.println("Enter the answer to the first hint: ");
                                            String hint1Answer= in.next();
                                            System.out.println("Enter the second hint: ");
                                            String hint2= in.next();
                                            System.out.println("Enter the answer to the second hint: ");
                                            String hint2Answer= in.next();
                                            profiles.add(new Profile(username,pass,hint1,hint1Answer,hint2,hint2Answer));
                                        }
                                    }
                                }catch (PassCheck p){
                                    System.out.println(p);
                                }
                            }
                        }
                    } catch (UserCheck u) {
                        System.out.println(u);
                    }
                    break;
                case 2:
                    System.out.println("Enter useraname: ");
                    String um=in.next();
                    for(Profile p:profiles){
                        if(um.equals(p.username)){
                            System.out.println("Enter password: ");
                            String password=in.next();
                            if(password.equals(p.password)){
                                System.out.println("Hint: "+p.hint1);
                                System.out.println("Enter answer to the first hint: ");
                                String ans=in.next();
                                System.out.println("Hint: "+p.hint2);
                                System.out.println("Enter answer to the second hint: ");
                                String ans2=in.next();
                                if(ans.equals(p.ans_hint1) && ans2.equals(p.ans_hint2)){
                                    System.out.println("Enjoy Java");
                                }
                                else {
                                    System.out.println("Wrong answer to security answer");
                                }
                            }
                        }
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