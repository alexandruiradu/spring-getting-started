package ro.sda.spring.exception.custom_exceptions;

public class ProductAppException extends RuntimeException{

    public ProductAppException(String message) {
        super(message);
    }
}
