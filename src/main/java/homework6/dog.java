package homework6;

public class dog extends Animal {

    public dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Bark!");
    }

    public static void main(String[] args) {
        new dog("Rex").makeSound();
    }
}