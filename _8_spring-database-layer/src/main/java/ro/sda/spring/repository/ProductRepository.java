package ro.sda.spring.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ro.sda.spring.model.Product;

import javax.annotation.PostConstruct;

@Repository
public class ProductRepository {

    JdbcTemplate template;

    @PostConstruct
    void initDatabase() {
        String createTable = "CREATE TABLE IF NOT EXISTS product(id bigint auto_increment, name varchar(255))";
        template.update(createTable);
    }

    public ProductRepository(JdbcTemplate template) {
        this.template = template;
    }

    public void addProduct(Product p) {
        String query = "INSERT INTO product (name) VALUES (?)";
        template.update(query, p.getName());
    }

}
