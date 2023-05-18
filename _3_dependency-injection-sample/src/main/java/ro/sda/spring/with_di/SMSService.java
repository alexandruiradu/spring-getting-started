package ro.sda.spring.with_di;

public class SMSService implements MessageService {
    @Override
    public void processMessage(String msg, String rec) {
        System.out.println("SMS sent to " + rec + " with message = " + msg);
    }
}
