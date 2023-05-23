package ro.sda.spring._1_.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._1_.beans.Cat;

@Configuration
@ComponentScan(basePackages = "ro.sda.spring._1_.components")
public class ProjectConfiguration {
    @Bean
    public Cat cat(){
        return new Cat();
    }

}
