package ro.sda.spring.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PayPalRepository {

    // clients and their balance
    private Map<String, Integer> clients;

    public PayPalRepository() {
        this.clients = new HashMap<>();
    }

    public void addPayment(int amount, String receiver) {
        if (clients.containsKey(receiver)) {
            int initialAmount = clients.get(receiver);
            clients.put(receiver, initialAmount + amount);
        } else {
            clients.put(receiver, amount);
        }
    }

    public void printAll() {
        for (Map.Entry<String, Integer> pair : clients.entrySet()) {
            System.out.println("Client: " + pair.getKey() + " balance: " + pair.getValue());
        }
    }
}
