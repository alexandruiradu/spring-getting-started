package ro.sda.spring.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ro.sda.spring.exception.custom_exceptions.NotFoundException;
import ro.sda.spring.exception.custom_exceptions.ProductAppException;
import ro.sda.spring.exception.model.ClientError;

import java.time.LocalDateTime;

import static ro.sda.spring.util.AppConstants.GENERIC_ERROR_MESSAGE;

@Slf4j
@RestControllerAdvice
public class ProductAppExceptionHandler {

    @ExceptionHandler(value = ProductAppException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ClientError genericException(ProductAppException ex) {
        log.warn("An exception has occurred with message: {}", ex.getMessage(), ex);
        return new ClientError(LocalDateTime.now(), GENERIC_ERROR_MESSAGE, HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

    @ExceptionHandler(value = NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ClientError genericException(NotFoundException ex) {
        log.warn("An exception has occurred with message: {}", ex.getMessage(), ex);
        return new ClientError(LocalDateTime.now(), ex.getMessage(), HttpStatus.NOT_FOUND.value());
    }
}
