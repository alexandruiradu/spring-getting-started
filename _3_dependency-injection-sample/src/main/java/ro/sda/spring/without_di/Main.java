package ro.sda.spring.without_di;

public class Main {
    public static void main(String[] args) {
        Client app = new Client();
        app.processMessage("ALERT","catalin@abc.com");
    }
}
