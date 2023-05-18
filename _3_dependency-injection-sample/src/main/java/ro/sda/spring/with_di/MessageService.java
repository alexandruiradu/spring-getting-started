package ro.sda.spring.with_di;

public interface MessageService {

    // methods in interfaces are by default public and abstract
    void processMessage(String msg, String rec);
}
