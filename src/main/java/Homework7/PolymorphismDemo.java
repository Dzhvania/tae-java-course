//@Author Dimitri Zhvania
package Homework7;

public class PolymorphismDemo {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Rex"),
                new Cat("simba"),
                new Dog("chapa"),
                new Cat("nala")
        };

        for (Animal animal : animals) {

            if (animal instanceof Dog) {
                System.out.print(animal.name + " (Dog): ");
            } else if (animal instanceof Cat) {
                System.out.print(animal.name + " (Cat): ");
            }

            animal.makeSound();
            animal.sleep();
        }
    }
}