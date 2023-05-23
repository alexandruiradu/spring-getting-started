package ro.sda.spring._5_.beans;

import lombok.ToString;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog {

    public Dog(){
        System.out.println("Dog constructor called!");
    }

    public void sayHam(){
        System.out.println("Ham ham!");
    }

    @PostConstruct
    private void init(){
        System.out.println("Dog bean was created!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog is destroying...");
    }


}
