package ro.sda.spring.with_di;

public class EmailService implements MessageService {
    @Override
    public void processMessage(String msg, String rec) {
        System.out.println("Email sent to " + rec + " with message = " + msg);
    }
}
