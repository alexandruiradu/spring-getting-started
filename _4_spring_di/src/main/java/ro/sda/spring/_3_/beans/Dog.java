package ro.sda.spring._3_.beans;

import lombok.ToString;
@ToString
public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
        System.out.println("Dog constructor called!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
