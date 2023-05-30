package ro.sda.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring.config.ProjectConfig;
import ro.sda.spring.model.Product;
import ro.sda.spring.repository.ProductRepository;
import ro.sda.spring.service.ProductService;

public class Main {
    public static void main(String[] args) {

        try (var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

//            ProductRepository repo = ctx.getBean(ProductRepository.class);
//
//            repo.addProduct(new Product("ps5", 400));
//            repo.addProduct(new Product("ps4", 100));
//            repo.addProduct(new Product("iphone 14", 800));
//            repo.addProduct(new Product("mac book", 2000));
//
//            System.out.println(repo.getAllProducts());
//
//            System.out.println("--------------------------");
//
//            try {
//                repo.addProductsWithoutTx(new Product("tv", 700), new Product("laptop", 3000));
//            } catch (RuntimeException e) {
//                System.out.println("Exception message: " + e.getMessage());
//            }
//
//            for (Product p : repo.getAllProducts()) {
//                System.out.println(p);
//            }
//
//            try {
//                repo.addProductsTransactional(new Product("headset", 300), new Product("monitor", 2500));
//            } catch (RuntimeException e) {
//                System.out.println("Exception message: " + e.getMessage());
//            }
//
//            System.out.println("-----------------------");
//
//            for (Product p : repo.getAllProducts()) {
//                System.out.println(p);
//            }

            ProductService service = ctx.getBean(ProductService.class);

            service.addProduct("ps5", 400);
            service.addProduct("iphone 13", 700);
            service.addProduct("mac book", 1000);


            for(Product p : service.getAllProducts()){
                System.out.println(p);
            }

            System.out.println("--------------------------");

            service.addProductsWithoutTx("tv", 2500, "laptop", 3000);

            for(Product p : service.getAllProducts()){
                System.out.println(p);
            }


            System.out.println("--------------------------");

            service.addProductsTransactional("headset", 400, "monitor", 2500);

            for(Product p : service.getAllProducts()){
                System.out.println(p);
            }


            System.out.println("--------------------------");

            service.addProductsTransactional("watch", 800, "samsung galaxy s20", 700);

            for(Product p : service.getAllProducts()){
                System.out.println(p);
            }

        }

    }
}