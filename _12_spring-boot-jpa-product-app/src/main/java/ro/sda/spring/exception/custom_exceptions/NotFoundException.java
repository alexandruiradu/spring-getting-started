package ro.sda.spring.exception.custom_exceptions;

public class NotFoundException extends ProductAppException{
    public NotFoundException(String message) {
        super(message);
    }
}
