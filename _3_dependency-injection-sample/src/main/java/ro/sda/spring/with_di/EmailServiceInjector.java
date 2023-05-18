package ro.sda.spring.with_di;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public ServiceConsumer getServiceConsumer() {
        return new MyDiApplication(new EmailService());
    }
}
