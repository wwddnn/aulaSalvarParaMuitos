package com.devsuperior.aula.services;
import com.devsuperior.aula.dto.CategoryDTO;
import com.devsuperior.aula.dto.ProductDTO;
import com.devsuperior.aula.entities.Category;
import com.devsuperior.aula.entities.Product;
import com.devsuperior.aula.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    //dependency
    @Autowired
    private ProductRepository repository;

    //insert method
    public ProductDTO insert (ProductDTO dto) {
        Product entity = new Product();

        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        //traverse the list of dto.getCategories()
        for(CategoryDTO catDTO : dto.getCategories()) {
            //create new category in database to receive the data of dto.getCategories()
            Category cat = new Category();
            cat.setId(catDTO.getId());
            entity.getCategories().add(cat);
        }

        entity = repository.save(entity);

        return new ProductDTO(entity);
    }


}
