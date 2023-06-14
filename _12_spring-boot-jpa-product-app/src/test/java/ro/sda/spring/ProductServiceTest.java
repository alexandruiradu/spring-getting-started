package ro.sda.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ro.sda.spring.model.Product;
import ro.sda.spring.repository.ProductRepository;
import ro.sda.spring.service.ProductService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository repository;

    @InjectMocks
    private ProductService service;

    @Test
    public void testFindById() {

        Product p = new Product(100, "test", 500, false);

        Mockito.when(repository.findById(100)).thenReturn(Optional.of(p));

        Product result = service.findById(100);

        assertEquals(100, result.getId());
        assertEquals("test", result.getName());
        assertEquals(500, result.getPrice());
        assertFalse(result.isInStock());
    }
}
