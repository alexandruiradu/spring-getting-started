package ro.sda.spring.pass_by_reference;

import java.util.List;

public class Bank {
    private List<Customer> clients;

    public Bank(List<Customer> clients) {
        this.clients = clients;
    }

    public void addCustomer(Customer c){
        clients.add(c);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "clients=" + clients +
                '}';
    }
}
