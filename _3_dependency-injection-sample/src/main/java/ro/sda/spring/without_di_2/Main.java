package ro.sda.spring.without_di_2;

public class Main {
    public static void main(String[] args) {

        Client emailClient = new Client(new EmailService());
        Client smsClient = new Client(new SmsService());

        emailClient.processMessage("a","b");
        smsClient.processMessage("c","d");

    }
}
