package ro.sda.spring._5_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._5_.beans.Dog;
import ro.sda.spring._5_.beans.Owner;
import ro.sda.spring._5_.config.ProjectConf;

public class Main {

    public static void main(String[] args) {

        try(var ctx = new AnnotationConfigApplicationContext(ProjectConf.class)) {

            Dog d = ctx.getBean(Dog.class);
            System.out.println(d);

            Dog d2 = ctx.getBean(Dog.class);
            System.out.println(d2);

            Dog d3 = ctx.getBean(Dog.class);
            System.out.println(d3);

            Owner o = ctx.getBean(Owner.class);
            System.out.println(o);

            System.out.println("Before exiting try with resources!");
        }

        System.out.println("After try with resources!");
    }
}
