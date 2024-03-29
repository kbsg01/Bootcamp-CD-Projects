package com.kb.categoriesproducts.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kb.categoriesproducts.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
    List<Product> findAll();
}
