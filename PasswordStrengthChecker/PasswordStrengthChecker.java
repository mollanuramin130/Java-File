import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = scanner.nextLine();
        scanner.close();

        int score = checkPasswordStrength(password);
        
        if (score >= 5) {
            System.out.println("Password is strong.");
        } else if (score >= 3) {
            System.out.println("Password is moderate.");
        } else {
            System.out.println("Password is weak.");
        }
    }

    public static int checkPasswordStrength(String password) {
        int score = 0;

        // Check the length of the password
        if (password.length() >= 8) {
            score++;
        }

        // Check for the presence of uppercase letters
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Check for the presence of lowercase letters
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Check for the presence of numbers
        if (password.matches(".*\\d.*")) {
            score++;
        }

        // Check for the presence of special characters
        Pattern specialChars = Pattern.compile("[!@#$%^&*()_+\\[\\]{};':\",.<>?/\\\\]");
        Matcher matcher = specialChars.matcher(password);
        if (matcher.find()) {
            score++;
        }

        return score;
    }
}
