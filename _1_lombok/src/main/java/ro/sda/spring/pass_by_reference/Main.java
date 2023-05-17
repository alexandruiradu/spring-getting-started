package ro.sda.spring.pass_by_reference;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Customer> list = new ArrayList<>();

        Bank bank = new Bank(list);

        list.add(new Customer("Ronaldo", 37));

        System.out.println(bank);

    }


}
