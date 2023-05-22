package ro.sda.spring._2_.beans;

import lombok.ToString;

@ToString
public class Owner {
    private String name;
    private Dog dog;

    public Owner() {
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
}

