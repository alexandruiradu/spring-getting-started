package ro.sda.spring._5_.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Owner {
    private Dog dog;

    public Owner(Dog dog) {
        this.dog = dog;
        System.out.println("Owner constructor called!");
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @PostConstruct
    public void init(){
        System.out.println("Owner was created!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Owner is destroying...");
    }

    @Override
    public String toString() {
        return "Owner{" +
                "dog=" + dog +
                '}';
    }
}
