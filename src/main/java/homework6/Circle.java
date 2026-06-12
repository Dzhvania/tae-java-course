//@Author Dimitri Zhvania
package homework6;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.area());

        Circle circle = new Circle(3);
        System.out.printf("%.2f%n", circle.area());
    }
}