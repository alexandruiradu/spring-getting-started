package ro.sda.spring._5_.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ro.sda.spring._5_.beans.Dog;
import ro.sda.spring._5_.beans.Owner;

@Configuration
@ComponentScan("ro.sda.spring._5_.beans")
public class ProjectConf {

    @Bean
    @Scope(value = "prototype")
    public Dog dog(){
        return new Dog();
    }

}
