package ro.sda.spring.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ro.sda.spring.model.Product;

import java.sql.ResultSet;
import java.util.List;

@Slf4j
@Repository
public class ProductRepository {

    private JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    private void init() {
        String sql = "CREATE TABLE IF NOT EXISTS product(" +
                "id bigint auto_increment, " +
                "name varchar(255)," +
                "price double," +
                "description varchar(255))";
        jdbcTemplate.update(sql);
        log.info("Database created!");
    }

    @PreDestroy
    private void dropDataBase() {
        String sql = "DROP TABLE product";
        jdbcTemplate.update(sql);
        log.info("Database cleaned!");
    }

    public void addProduct(Product p) {
        String sql = "INSERT INTO product(name,price,description) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, p.getName(), p.getPrice(), p.getDescription());
    }

    public List<Product> getAllProducts() {
        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, (rs,rowNum) -> new Product(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("price"),
                rs.getString("description")
        ));
    }
}
