package ro.sda.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.sda.spring.exception.custom_exceptions.NotFoundException;
import ro.sda.spring.exception.custom_exceptions.ProductAppException;
import ro.sda.spring.model.Product;
import ro.sda.spring.repository.ProductRepository;

import java.util.List;
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

    public List<Product> findAll() {
        log.info("Retrieving all products from database");
        return repository.findAll();
    }

    public List<Product> findProductsWithPriceGreaterOrEqualThan(int price) {
        log.info("Querying for products with price greater or equal than {}", price);
        List<Product> products = repository.findProductsByPriceGreaterThanEqual(price);

        if (products.size() == 0) {
            throw new NotFoundException(
                    "There are no products within the price range that you requested"
            );
        }
        return products;
    }

    //    public void deleteProduct(int id) {
//        Optional<Product> optional = repository.findById(id);
//        if (optional.isPresent()){
//            repository.delete(optional.get());
//        }
//        throw new NotFoundException(
//                "Product that you want to delete is not present in the database."
//        );
//    }
    public void deleteProduct(int id) {
        log.info("Attempting to delete product with id {}", id);
        Optional<Product> optional = repository.findById(id);
        Product found = optional.orElseThrow(() -> new NotFoundException(
                "Product that you want to delete is not present in the database."
        ));
        repository.delete(found);
    }

    public void updateProduct(Product update) {
        log.info("Attempting to update product with id {}", update.getId());
        Optional<Product> optional = repository.findById(update.getId());
        Product existent = optional.orElseThrow(() -> new NotFoundException(
                "Product that you want to update is not present in the database."
        ));
        existent.setName(update.getName());
        existent.setPrice(update.getPrice());
        existent.setInStock(update.isInStock());

        repository.save(existent);
    }
}
