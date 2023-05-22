package ro.sda.spring.with_di;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public ServiceConsumer getServiceConsumer() {
        return new ServiceClient(new SMSService());
    }
}
