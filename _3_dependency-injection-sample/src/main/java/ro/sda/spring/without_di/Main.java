package ro.sda.spring.without_di;

public class Main {
    public static void main(String[] args) {
        EmailServiceClient app = new EmailServiceClient();
        app.processMessage("ALERT","catalin@abc.com");
    }
}
