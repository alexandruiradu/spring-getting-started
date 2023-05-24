package ro.sda.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring.config.Config;
import ro.sda.spring.repository.PayPalRepository;
import ro.sda.spring.services.PaymentGateway;

public class Main {
    public static void main(String[] args) {


        try (var c = new AnnotationConfigApplicationContext(Config.class)) {

            PaymentGateway paymentGateway = c.getBean(PaymentGateway.class);

            paymentGateway.initiatePaymentProcess(200, "George");
            paymentGateway.initiatePaymentProcess(450, "Joe");
            paymentGateway.initiatePaymentProcess(300, "Joe");
            paymentGateway.initiatePaymentProcess(500, "Joe");
            paymentGateway.initiatePaymentProcess(700, "Trump");
            paymentGateway.initiatePaymentProcess(800, "Trump");

            PayPalRepository payPalRepository = c.getBean(PayPalRepository.class);
            payPalRepository.printAll();

        }

    }
}