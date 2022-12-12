package com.kb.productoscategorias.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kb.productoscategorias.models.Product;
import com.kb.productoscategorias.repositories.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> allProducts(){
        return productRepo.findAll();
    }

    public Product createProduct(Product product){
        return productRepo.save(product);
    }

    public Product finProduct(Long id){
        Optional<Product> opProduct = productRepo.findById(id);
        if (opProduct.isPresent()) {
            return opProduct.get();
        } else {
            return null;
        }
    }

    public Product updateProduct(Product product){
        return this.productRepo.save(product);
    }
}
