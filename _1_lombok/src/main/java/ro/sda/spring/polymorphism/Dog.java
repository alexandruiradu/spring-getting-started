package ro.sda.spring.polymorphism;

public class Dog extends Animal {
    private String dogBreed;

    public Dog(String name, String color, String dogBreed) {
        super(name, color);
        this.dogBreed = dogBreed;
    }

    @Override
    public void makeSound() {
        System.out.println("Ham-ham");
    }
}
