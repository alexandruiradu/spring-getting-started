package ro.sda.spring._3_.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._3_.beans.Dog;
import ro.sda.spring._3_.beans.Owner;

@Configuration
public class ProjectConfig {

    @Bean
    public Owner owner() {
        Owner o = new Owner("Messi");
        // o.setDog(dog());
        return o;
    }

    @Bean
    public Dog dog() {
        return new Dog("Max");
    }
}
