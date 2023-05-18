package ro.sda.spring.with_di;

public class MyDiApplication implements ServiceConsumer {

    private MessageService service;

    public MyDiApplication(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessage(String m, String r) {
        service.processMessage(m, r);
    }
}
