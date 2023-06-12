package ro.sda.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.sda.spring.model.Product;
import ro.sda.spring.repository.ProductRepository;

import java.util.List;

@Slf4j
@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product p) {
        productRepository.addProduct(p);
        log.info("Product: {} added to the database!", p);
    }

    public List<Product> getAllProducts() {
        log.info("Retrieving all products from database");
        return productRepository.getAllProducts();
    }

    public Product getById(int id) {
        log.info("Retrieving product with id {}", id);
        return productRepository.getById(id);
    }
}
