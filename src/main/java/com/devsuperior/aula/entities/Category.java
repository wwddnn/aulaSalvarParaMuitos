package com.devsuperior.aula.entities;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_category")
public class Category {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //relationship
    @ManyToMany(mappedBy = "categories")
    private Set<Product> products = new HashSet<>();

    //constructor without parameters
    public Category() {
    }

    //constructor with parameters
    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //get and set methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //for the list only get method
    public Set<Product> getProducts() {
        return products;
    }
}
