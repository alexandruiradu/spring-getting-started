package ro.sda.spring._2_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._2_.beans.Dog;
import ro.sda.spring._2_.beans.Owner;
import ro.sda.spring._2_.config.Config;

public class Main {

    public static void main(String[] args) {


        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class)) {

            Owner o1 = ctx.getBean("owner1", Owner.class);
            System.out.println(o1);

            Owner o2 = ctx.getBean("owner2", Owner.class);
            System.out.println(o2);

            Dog d1 = o1.getDog();
            System.out.println(d1);

            Dog d2 = o2.getDog();
            System.out.println(d2);

            Dog d3 = ctx.getBean("dog1", Dog.class);
            System.out.println(d3);

            Dog d4 = ctx.getBean("dog2", Dog.class);
            System.out.println(d4);
        }


    }
}
