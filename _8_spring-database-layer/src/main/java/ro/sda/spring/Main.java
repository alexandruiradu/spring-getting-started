package ro.sda.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring.config.ProjectConfig;
import ro.sda.spring.model.Product;
import ro.sda.spring.repository.ProductRepository;

public class Main {
    public static void main(String[] args) {

        try(var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            ProductRepository repo = ctx.getBean(ProductRepository.class);

            repo.addProduct(new Product("ps5", 400));
        }

    }
}