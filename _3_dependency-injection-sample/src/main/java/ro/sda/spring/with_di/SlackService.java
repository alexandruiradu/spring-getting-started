package ro.sda.spring.with_di;

public class SlackService implements MessageService {
    @Override
    public void processMessage(String msg, String rec) {
        System.out.println("Slack sent to " + rec + " with message = " + msg);
    }
}
