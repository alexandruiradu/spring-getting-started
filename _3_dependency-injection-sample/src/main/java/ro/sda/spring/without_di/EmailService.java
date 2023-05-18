package ro.sda.spring.without_di;

public class EmailService {

    // real service that sends emails to customers
    public void sendEmail(String message, String receiver) {
        System.out.print("Email sent to " + receiver + " with message = " + message);
    }
}
