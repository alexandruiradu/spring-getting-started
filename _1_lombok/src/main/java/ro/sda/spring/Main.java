package ro.sda.spring;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User("Catalin", "Manaila", 25);

        user1.setAge(100);
        user1.setFirstName("Leo");
        user1.setLastName("Messi");

        System.out.println(user1);
        System.out.println(user2);

        System.out.println("----------------");


        Set<User> userSet = new HashSet<>();

        userSet.add(new User("Catalin", "Manaila", 25));
        userSet.add(new User("Alexandru", "Radu", 25));
        userSet.add(new User("Catalin", "Manaila", 25));

        for(User x : userSet){
            System.out.println(x);
        }
    }


}
