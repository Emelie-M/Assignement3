public class PassCheck extends Exception{
    public String toString() {
        return ("The password should not contain the username\nat least be 8 characters long\n at least 1 capital letter\n at least 2 digits\n at least 1 special character");
    }
}
