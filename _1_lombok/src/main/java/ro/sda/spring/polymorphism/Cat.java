package ro.sda.spring.polymorphism;

import java.security.spec.RSAOtherPrimeInfo;

public class Cat extends Animal{

    private String furType;

    public Cat(String name, String color, String furType) {
        super(name, color);
        this.furType = furType;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
