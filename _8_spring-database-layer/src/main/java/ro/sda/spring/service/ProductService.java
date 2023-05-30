package ro.sda.spring.service;

import org.springframework.stereotype.Service;
import ro.sda.spring.model.Product;
import ro.sda.spring.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void addProduct(String name, int price) {
        this.repository.addProduct(new Product(name, price));
        System.out.println("Product added successfully!");
    }

    public void addProductsWithoutTx(String p1Name, double p1Price, String p2Name, double p2Price) {
        try {
            this.repository.addProductsWithoutTx(new Product(p1Name, p1Price), new Product(p2Name, p2Price));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void addProductsTransactional(String p1Name, double p1Price, String p2Name, double p2Price) {
        try {
            this.repository.addProductsTransactional(new Product(p1Name, p1Price), new Product(p2Name, p2Price));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public List<Product> getAllProducts(){
        return this.repository.getAllProducts();
    }
}
