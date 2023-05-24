package ro.sda.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    // field dependency injection
//    @Autowired
    private NameService nameService;

    public HelloService(@Qualifier("simpleNameService") NameService nameService) {
        this.nameService = nameService;
        System.out.println("HelloService constructor called!");
    }

    public void sayHello() {
        String name = nameService.getName();
        System.out.println("Hello, " + name + "!");
    }


    //setter dependency injection
//    @Autowired
//    @Qualifier("simple")
//    public void setNameService(NameService nameService) {
//        this.nameService = nameService;
//    }
}

