package com.devsuperior.aula.dto;
import com.devsuperior.aula.entities.Category;

public class CategoryDTO {

    //attributes
    private Long id;
    private String name;

    //constructor
    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //constructor with identity
    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

    //get method
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
