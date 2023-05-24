package ro.sda.spring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@Primary
public class RandomNameService implements NameService {
    static List<String> names = List.of("Neymar", "Messi", "Ronaldo", "Mbappe");

    public RandomNameService() {
        System.out.println("RandomNameService constructor called!");
    }

    @Override
    public String getName() {
        int idx = new Random().nextInt(4);
        return names.get(idx);
    }
}
