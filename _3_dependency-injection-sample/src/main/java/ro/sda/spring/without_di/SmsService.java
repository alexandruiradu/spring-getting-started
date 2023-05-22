package ro.sda.spring.without_di;

public class SmsService {
    public void processMessage(String msg, String rec) {
        System.out.println("SMS sent to " + rec + " with message = " + msg);
    }
}
