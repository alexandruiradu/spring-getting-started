package ro.sda.spring.services;

public interface PaymentService {

    void pay(int amount, String receiver);
}
