package ro.sda.spring.with_di;

public class SlackServiceInjector implements MessageServiceInjector {

    @Override
    public ServiceConsumer getServiceConsumer() {
        return new MyDiApplication(new SlackService());
    }
}
