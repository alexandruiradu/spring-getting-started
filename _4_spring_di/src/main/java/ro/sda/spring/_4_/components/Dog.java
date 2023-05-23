package ro.sda.spring._4_.components;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name;

    public Dog(){
        System.out.println("Dog constructor called!");
        this.name = "Max";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
