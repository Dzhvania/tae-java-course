//@Author

package Homework8;

public class FinallyDemo {

    public static void main(String[] args) {

        System.out.println(readNumber("100"));
        System.out.println(readNumber("xyz"));

    }

    static int readNumber(String s) {

        try {
            return Integer.parseInt(s);

        } catch (NumberFormatException e) {

            System.out.println("შეცდომა");
            return -1;

        } finally {

            System.out.println("დასრულდა readNumber");

        }
    }
}
