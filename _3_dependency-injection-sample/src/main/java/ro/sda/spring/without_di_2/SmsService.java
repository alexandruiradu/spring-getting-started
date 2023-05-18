package ro.sda.spring.without_di_2;

public class SmsService implements MessageService{

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("SMS sent to " + rec + " with message = " + msg);
    }
}
