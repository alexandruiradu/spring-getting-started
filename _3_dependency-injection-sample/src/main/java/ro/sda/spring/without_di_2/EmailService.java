package ro.sda.spring.without_di_2;

public class EmailService implements MessageService {

    // real service that sends emails to customers
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with message = " + message);
    }
}
