package ro.sda.spring._3_.beans;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
public class Owner {

    private String name;

    // annotating an instance variable with @Autowired will oblige the framework to inject
    // the dependency in this field (field injection)
    @Autowired
    private Dog dog;

    public Owner(String name) {
        this.name = name;
        System.out.println("Owner constructor called!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    // annotating a setter with @Autowired will oblige the framework to inject
    // the dependency using this setter (setter injection)
//    @Autowired
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }
}
