package ro.sda.spring._4_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._4_.components.Dog;
import ro.sda.spring._4_.components.Owner;
import ro.sda.spring._4_.config.Config;

public class Main {

    public static void main(String[] args) {

        try(var ctx = new AnnotationConfigApplicationContext(Config.class)){

            Dog d = ctx.getBean(Dog.class);

            System.out.println(d);

            Owner o = ctx.getBean(Owner.class);

            System.out.println(o);

            System.out.println(o.getDog());



        }


    }


}
