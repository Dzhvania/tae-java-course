//@Author Dimitri Zhvania
package homework6;

public class Vehicle {

    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void info() {
        System.out.println(brand + " " + year);
    }
}