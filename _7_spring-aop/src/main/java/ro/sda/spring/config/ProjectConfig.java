package ro.sda.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ro.sda.spring.aspects.MathAspect;

@Configuration
@ComponentScan("ro.sda.spring.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public MathAspect mathAspect(){
        return new MathAspect();
    }
}
