package homework5;

public class Fibonacci {

    public static long fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        long prev1 = 1;
        long prev2 = 0;
        long current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println(fib(26));
    }
}