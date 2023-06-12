package ro.sda.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.sda.spring.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
