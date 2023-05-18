package ro.sda.spring.without_di;

public class EmailServiceClient {

    private EmailService service;

    public EmailServiceClient() {
        service = new EmailService();
    }

    public void processMessage(String m, String r) {
        this.service.sendEmail(m, r);
    }
}
