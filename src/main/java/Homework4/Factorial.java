// @Author <Dimitri Zhvania>
package Homework4;

public class Factorial {
    public static void main(String[] args) {
    // ჩემი დაბადების თვე არის ერთი ამიტომ გამოვიყენე რენდომად 5
        int month = 5;

        long factorial = 1;

        for (int i = 1; i <= month; i++) {
            factorial = factorial * i;
        }

        System.out.println(month + "! = " + factorial);
    }
}