

import java.util.Scanner;
public class Ques30 {
    public static boolean isValidPassword(String password) {
        // Check password length
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }

        // Check for at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check for at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check for at least one digit
        if (!password.matches(".*[1-9].*")) {
            return false;
        }

        // Check for at least one special character
        if (!password.matches(".*[!@#$%^&*()].*")) {
            return false;
        }

        // Password passed all checks
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Password");
        String password=sc.nextLine();
        boolean isValid = isValidPassword(password);
        System.out.println("Is valid password? " + isValid);
    }
}
