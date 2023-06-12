package ro.sda.spring.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String name1 = getNameWithoutOptional(false);
        System.out.println("Is blank: " + name1.isBlank());

//        String name2 = getNameWithoutOptional(true);
//        System.out.println("Is blank: " + name2.isBlank());

        Optional<String> opt1 = getName(false);

        if (opt1.isPresent()) {
            String name = opt1.get();
            System.out.println("Is blank: " + name.isBlank());
        }

        opt1.ifPresent(System.out::println);

        Optional<String> opt2 = getName(true);

        if (opt2.isPresent()) {
            String name = opt2.get();
            System.out.println("Is blank: " + name.isBlank());
        } else {
            System.out.println("Not present");
        }

    }


    private static Optional<String> getName(boolean isNull) {
        return isNull ? Optional.empty() : Optional.of("Catalin");
    }

    private static String getNameWithoutOptional(boolean issNull) {
//        if (issNull) {
//            return null;
//        } else {
//            return "Catalin";
//        }
//
        return issNull ? null : "Catalin";
    }

}
