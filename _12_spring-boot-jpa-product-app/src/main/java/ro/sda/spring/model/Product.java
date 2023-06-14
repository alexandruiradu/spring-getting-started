package ro.sda.spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Name is required")
    private String name;
    @Min(value = 1, message = "Price must be greater than 0")
    private int price;
    @JsonProperty("isInStock")
    private boolean isInStock;

}
