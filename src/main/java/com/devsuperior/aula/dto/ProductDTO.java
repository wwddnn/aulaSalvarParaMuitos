package com.devsuperior.aula.dto;
import com.devsuperior.aula.entities.Category;
import com.devsuperior.aula.entities.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductDTO {

    //attributes
    private Long id;
    private String name;
    private Double price;

    //association. obs. we go use List and ArrayList, and don't use Set and Hashset.
    private List<CategoryDTO> categories = new ArrayList<>();

    //constructor with parameters. don't put collection here.
    public ProductDTO(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //constructor with entity
    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        //because is a List, and ManyToMany
        for (Category cat : entity.getCategories()) {
            categories.add(new CategoryDTO(cat));
        }
    }

    //get method. include get method list
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    //get list method
    public List<CategoryDTO> getCategories() {
        return categories;
    }
}
