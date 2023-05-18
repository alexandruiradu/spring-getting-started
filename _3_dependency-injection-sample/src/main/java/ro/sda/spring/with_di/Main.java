package ro.sda.spring.with_di;

public class Main {

    public static void main(String[] args) {

        MessageServiceInjector injector = null;
        ServiceConsumer app = null;

        injector = new EmailServiceInjector();
        app = injector.getServiceConsumer();

        app.processMessage("ALERT", "catalin@yahoo.com");


        injector = new SMSServiceInjector();
        app = injector.getServiceConsumer();

        app.processMessage("ALERT", "072222222");


        injector = new SlackServiceInjector();
        app = injector.getServiceConsumer();

        app.processMessage("ALERT", "slack_address");


    }
}
