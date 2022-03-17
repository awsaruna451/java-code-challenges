import java.util.Scanner;

public class PasswordComplexity {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password::");
        String x = scanner.next();
        System.out.println("Password is valid::" + isPasswordComplexityOk(x));
    }

    public static boolean isPasswordComplexityOk(String password) {

        if (password.length() < 6) {
            return false;
        }
        boolean isLowerCharacter = false;
        boolean isUpperCharacter = false;
        boolean isNumericValue = false;

        for (int x =0; x < password.length()
                || (!isLowerCharacter && !isUpperCharacter
                && !isNumericValue) ; x ++){

            char current = password.charAt(x);

            if (Character.isDigit(current)) {
                isNumericValue = true;
            } else if (Character.isUpperCase(current)) {
                isUpperCharacter = true;
            } else if (Character.isLowerCase(current)) {
                isLowerCharacter = true;
            }

        }
      return isNumericValue && isLowerCharacter && isUpperCharacter;
    }
    public static boolean passwordComplexity(String password) {
      return password.length()>= 6
              && password.matches(".*\\d.*")
              && password.matches(".*[a-z].*")
              && password.matches(".*[A-Z].*");
    }
}
