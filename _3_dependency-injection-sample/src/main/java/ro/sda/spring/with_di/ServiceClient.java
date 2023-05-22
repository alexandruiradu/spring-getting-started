package ro.sda.spring.with_di;

public class ServiceClient implements ServiceConsumer {

    private MessageService service;

    public ServiceClient(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessage(String m, String r) {
        service.processMessage(m, r);
    }
}
