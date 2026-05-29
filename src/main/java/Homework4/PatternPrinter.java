// @Author <Dimitri Zhvania>
package Homework4;

public class PatternPrinter {
    public static void main(String[] args) {

        String name = "Dimitri";

        int height = name.length();

        for (int i = 1; i <= height; i++) {

            for (int d = 1; d <= i; d++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

