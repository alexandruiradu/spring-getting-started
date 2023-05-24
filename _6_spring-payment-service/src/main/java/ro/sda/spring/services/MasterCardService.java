package ro.sda.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sda.spring.repository.MasterCardRepository;

@Service
public class MasterCardService implements PaymentService {


    private MasterCardRepository masterCardRepository;

    @Override
    public void pay(int amount, String receiver) {
        masterCardRepository.addPayment(amount, receiver);
        System.out.println("The amount " + amount + " was payed to " + receiver + " by MasterCard.");
    }

    @Autowired
    public void setMasterCardRepository(MasterCardRepository masterCardRepository) {
        this.masterCardRepository = masterCardRepository;
    }
}
