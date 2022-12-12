package com.kb.productoscategorias.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kb.productoscategorias.models.Category;
import com.kb.productoscategorias.repositories.CategoryRepository;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepo;

    public CategoryService(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public List<Category> allCategories(){
        return categoryRepo.findAll();
    }

    public Category createCat(Category category){
        return categoryRepo.save(category);
    }

    public Category findCategory(Long id){
        Optional<Category> opCategory = categoryRepo.findById(id);
        if (opCategory.isPresent()) {
            return opCategory.get();
        } else {
            return null;
        }
    }

    public Category updCategory(Category category){
        return this.categoryRepo.save(category);
    }
}
