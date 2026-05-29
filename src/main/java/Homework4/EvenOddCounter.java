// @Author <Dimitri Zhvania>
package Homework4;

public class EvenOddCounter {
    public static void main(String[] args) {

        //ჩემი დაბადების წელი 00 ით მთავრდება ამიტო გამოვიყენე 1999

        int birthYear = 1999;
        int lastTwoDigits = birthYear % 100;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= lastTwoDigits; i++) {

            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Last two digits: " + lastTwoDigits);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}