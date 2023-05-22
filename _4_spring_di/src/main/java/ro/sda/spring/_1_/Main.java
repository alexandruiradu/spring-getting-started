package ro.sda.spring._1_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._1_.beans.Cat;
import ro.sda.spring._1_.components.Dog;
import ro.sda.spring._1_.config.ProjectConfiguration;

public class Main {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {

            Cat c = ctx.getBean(Cat.class);
            c.sayMeow();

            Dog d = ctx.getBean(Dog.class);
            d.sayHam();

        }
    }
}
