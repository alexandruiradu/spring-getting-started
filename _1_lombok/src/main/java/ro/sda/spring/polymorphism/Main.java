package ro.sda.spring.polymorphism;

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Dog("Rex", "brown", "pit-bull");

        Animal a2 = new Cat("Theresa", "black", "short-hair");

        a1.makeSound();

        a2.makeSound();

        System.out.println("---------------------");


        makeSound(new Dog("Rex", "brown", "pit-bull"));
        makeSound(new Cat("Theresa", "black", "short-hair"));
    }

    public static void makeSound(Animal animal) {
        animal.makeSound();
    }
}
