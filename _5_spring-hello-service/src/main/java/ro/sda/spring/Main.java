package ro.sda.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring.config.ProjectConf;
import ro.sda.spring.services.HelloService;
import ro.sda.spring.services.NameService;

public class Main {
    public static void main(String[] args) {

        try(var ctx = new AnnotationConfigApplicationContext(ProjectConf.class)){

            HelloService service = ctx.getBean(HelloService.class);
            service.sayHello();

            NameService nameService = ctx.getBean(NameService.class);
            System.out.println(nameService.getName());

            System.out.println("-------------------");

            NameService anotherNameService = ctx.getBean("simpleNameService", NameService.class);
            System.out.println(anotherNameService.getName());
        }

    }
}