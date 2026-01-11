package pl.edu.vistula.firstrestapispring.Product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "products")
public class Product {
@Id
@GeneratedValue
    private Long id;          // ⬅ ВАЖНО: Long
    private String name;

    public Product() {

    }       // ⬅ НУЖЕН для Spring / Jackson

    public Product(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {     // ⬅ Long
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

