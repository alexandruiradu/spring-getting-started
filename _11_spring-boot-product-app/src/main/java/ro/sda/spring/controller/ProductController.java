package ro.sda.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/product/{id}")
    public Product getById(@PathVariable int id){
        log.info("/product/id endpoint called");
        return productService.getById(id);
    }

}
