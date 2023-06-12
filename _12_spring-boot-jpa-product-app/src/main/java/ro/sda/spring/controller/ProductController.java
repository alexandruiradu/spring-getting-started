package ro.sda.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ro.sda.spring.model.Product;
import ro.sda.spring.service.ProductService;

@Slf4j
@RestController
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/product/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product p) {
        log.info("/product/add endpoint called");
        service.addProduct(p);
    }

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable int id){
        return service.findById(id);
    }
}
