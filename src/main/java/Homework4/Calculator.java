package Homework4;
// @Author <Dimitri Zhvania>
public class Calculator {
    public static void main(String[] args) {

        double a =20;
        double b =5;
        char op = '+';

        switch (op) {

            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("ნულზე გაყოფა აკრძალულია");
                }
                break;

            default:
                System.out.println("უცნობი ოპერაცია");
        }
    }
}