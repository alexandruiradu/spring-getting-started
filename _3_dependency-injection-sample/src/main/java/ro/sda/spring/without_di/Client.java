package ro.sda.spring.without_di;

public class Client {

    private EmailService service;

    public Client() {
        service = new EmailService();
    }

    public void processMessage(String m, String r) {
        this.service.sendEmail(m, r);
    }
}
