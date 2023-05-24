package ro.sda.spring.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("simple")
@Service
public class SimpleNameService implements NameService {

    public SimpleNameService() {
        System.out.println("SimpleNameService constructor called!");
    }

    @Override
    public String getName() {
        return "Catalin";
    }

}


