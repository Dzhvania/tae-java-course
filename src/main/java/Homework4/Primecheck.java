//Author <Dimitri Zhvania
package Homework4;

public class Primecheck {
    public static void main(String[] args) {

        int age = 26;
        boolean isPrime = true;

        for (int i = 2; i <= age / 2; i++) {

            if (age % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(age + " is prime");
        } else {
            System.out.println(age + " is not prime");
        }
    }
}