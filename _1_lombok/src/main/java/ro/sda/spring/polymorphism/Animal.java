package ro.sda.spring.polymorphism;

public abstract class Animal {

    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void makeSound();
}
