//@Author <Dimitri Zhvania>
package Homework4;

public class SumOfDigits {
    public static void main(String[] args) {

        int year = 1999;
        int sum = 0;

        while (year > 0) {

            int digit = year % 10;
            sum = sum + digit;

            year = year / 10;      // ბოლო ციფრის მოცილება
        }

        System.out.println("Digits sum = " + sum);
    }
}