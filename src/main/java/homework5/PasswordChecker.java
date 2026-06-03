// @Author Dimitri Zhvania
package homework5;
public class PasswordChecker {

    public static void main(String[] args) {
        System.out.println(isStrong("Ditodito123!"));
        System.out.println(isStrong("Password"));
    }

    public static boolean isStrong(String password) {

        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
        }

        return hasDigit && hasUpper;
    }
}