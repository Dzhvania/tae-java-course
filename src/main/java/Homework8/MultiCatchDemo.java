//@Author Dimitri Zhvania

package Homework8;

public class MultiCatchDemo {

    public static void main(String[] args) {

        processInput("abc");
        processInput("0");
        processInput("99");

    }

    static void processInput(String input) {

        try {

            int result = Integer.parseInt(input);

            int[] arr = {10, 20};

            System.out.println(arr[result] / result);

        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException");

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException");

        }

    }
}