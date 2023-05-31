package ro.sda.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.sda.spring.model.Product;
import ro.sda.spring.service.ProductService;

import java.util.List;

@Slf4j
@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product/add")
    public void addProduct(@RequestBody Product p) {
        log.info("/product/add endpoint called");
        productService.addProduct(p);
    }

    @GetMapping("/product/all")
    public List<Product> getAllProducts() {
        log.info("/product/all endpoint called");
        return productService.getAllProducts();
    }

}
