package ro.sda.spring.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentGateway {

    private PaymentService paymentService;

    public PaymentGateway(PaymentService payPalService) {
        this.paymentService = payPalService;
    }

    public void initiatePaymentProcess(int amount, String receiver) {
        System.out.println("Payment process was initiated using " + paymentService.getClass().getSimpleName());
        paymentService.pay(amount, receiver);
    }
}
