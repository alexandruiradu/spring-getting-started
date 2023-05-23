package ro.sda.spring._3_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._3_.beans.Dog;
import ro.sda.spring._3_.beans.Owner;
import ro.sda.spring._3_.config.ProjectConfig;

public class Main {

    public static void main(String[] args) {

        try (var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            Owner o = ctx.getBean(Owner.class);

            System.out.println(o);

            Dog d = o.getDog();

            System.out.println(d);

        }


    }


}
