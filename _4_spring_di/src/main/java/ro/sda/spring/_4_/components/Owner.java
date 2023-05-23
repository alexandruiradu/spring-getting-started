package ro.sda.spring._4_.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    private String name;

    private Dog dog;

    public Owner(Dog dog) {
        this.dog = dog;
        this.name = "Cristiano";
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

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
