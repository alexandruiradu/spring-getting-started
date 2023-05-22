package ro.sda.spring._2_.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._2_.beans.Dog;
import ro.sda.spring._2_.beans.Owner;

@Configuration
public class Config {

    // if we want to use dog1 as a dependency for owner ben we simply
    // can provide it as a parameter here with the same name as the method name
    // (method name is also the bean name in app context)
    @Bean
    public Owner owner1(Dog dog1){
        Owner o = new Owner();
        o.setDog(dog1);
        o.setName("John");
        return o;
    }

    // another way to specify the dependency that we want to use (bean name) is to use @Qualifier
    // using @Qualifier we are able to provide the bean name that we want to inject
    @Bean
    public Owner owner2(@Qualifier("dog2") Dog d){
        Owner o = new Owner();
        o.setDog(d);
        o.setName("Bob");
        return o;
    }

    @Bean
    public Dog dog1(){
        System.out.println("DOG 1 BEAN CREATED!");
        return new Dog("Rex");
    }

    @Bean
    public Dog dog2(){
        System.out.println("DOG 2 BEAN CREATED!");
        return new Dog("Max");
    }



}
