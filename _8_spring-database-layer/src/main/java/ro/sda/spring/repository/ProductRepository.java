package ro.sda.spring.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.sda.spring.model.Product;
import ro.sda.spring.util.ProductRowMapper;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

@Repository
public class ProductRepository {

    JdbcTemplate template;
    public ProductRepository(JdbcTemplate template) {
        this.template = template;
    }

    @PostConstruct
    void initDatabase() {
        String createTable = "CREATE TABLE IF NOT EXISTS product(id bigint auto_increment, name varchar(255), price double)";
        template.update(createTable);
    }

    public void addProduct(Product p) {
        String query = "INSERT INTO product (name, price) VALUES (?, ?)";
        template.update(query, p.getName(), p.getPrice());
    }

    public void addProductsWithoutTx(Product p1, Product p2){
        String query = "INSERT INTO product (name, price) VALUES (?, ?)";
        template.update(query, p1.getName(), p1.getPrice());
        if(p2.getPrice() > 2000){
            throw new RuntimeException("Something unexpected happened!");
        }
        template.update(query, p2.getName(), p2.getPrice());
    }

    @Transactional
    public void addProductsTransactional(Product p1, Product p2){
        String query = "INSERT INTO product (name, price) VALUES (?, ?)";
        template.update(query, p1.getName(), p1.getPrice());
        if(p2.getPrice() > 2000){
            throw new RuntimeException("Something unexpected happened!");
        }
        template.update(query, p2.getName(), p2.getPrice());
    }


    public List<Product> getAllProducts(){
        String query = "SELECT * FROM product";
        return template.query(query, new ProductRowMapper());
    }

}

