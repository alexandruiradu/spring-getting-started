package ro.sda.spring.without_di_2;

public class Client {

    private MessageService service;

    public Client(MessageService service) {
        this.service = service;
    }

    public void processMessage(String m, String r) {
        System.out.println("Message parsed");
        System.out.println("Extra logic...");
        this.service.sendMessage(m, r);
    }
}
