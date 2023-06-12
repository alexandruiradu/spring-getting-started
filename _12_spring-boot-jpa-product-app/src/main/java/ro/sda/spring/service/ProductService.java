package ro.sda.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.sda.spring.exception.ProductAppException;
import ro.sda.spring.model.Product;
import ro.sda.spring.repository.ProductRepository;

import java.util.Optional;

@Slf4j
@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void addProduct(Product p) {
        log.info("Adding product to database");
        repository.save(p);
    }

    public Product findById(int id) {
        log.info("Querying for product with id {}", id);
        Optional<Product> optional = repository.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        }

        log.warn("Product with id {} not found in the database!", id);
        throw new ProductAppException("Product with id: " + id + " not found");
    }
}
