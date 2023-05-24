package ro.sda.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sda.spring.repository.PayPalRepository;

@Service
public class PayPalService implements PaymentService {

    @Autowired
    private PayPalRepository payPalRepository;


    @Override
    public void pay(int amount, String receiver) {
        payPalRepository.addPayment(amount, receiver);
        System.out.println("The amount " + amount + " was payed to " + receiver + " by PayPal.");
    }
}
