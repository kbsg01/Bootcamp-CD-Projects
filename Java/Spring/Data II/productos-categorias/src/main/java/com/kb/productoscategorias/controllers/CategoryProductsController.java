package com.kb.productoscategorias.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kb.productoscategorias.models.Category;
import com.kb.productoscategorias.models.Product;
import com.kb.productoscategorias.services.CategoryService;
import com.kb.productoscategorias.services.ProductService;

@Controller
public class CategoryProductsController {
    private final CategoryService catService;
    private final ProductService prodService;

    public CategoryProductsController(CategoryService catService, ProductService prodService) {
        this.catService = catService;
        this.prodService = prodService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @GetMapping("/categories/new")
    public String createCategory(@ModelAttribute("category")Category category){
        return "newCategory";
    }

    @PostMapping("/categories/new")
    public String createCategory(@Valid @ModelAttribute("category")Category category, BindingResult result){
        if (result.hasErrors()) {
            return "newCategory";
        } else {
            catService.createCat(category);
            return "redirect:/";
        }
    }

    @GetMapping("/products/new")
    public String nProduct(@ModelAttribute("product")Product product){
        return "newProduct";
    }
    @PostMapping("/products/new")
    public String nProduct(@Valid @ModelAttribute("product") Product product, BindingResult result){
        if (result.hasErrors()) {
            return "newProduct";
        } else {
            prodService.createProduct(product);
            return "redirect:/products/new";
        }
    }

    @GetMapping("/categories/{id}")
    public String ShowCat(@PathVariable("id") Long id, Model model){
        Category cat = catService.findCategory(id);
        List<Product> catProd = cat.getProducts();
        List<Product> prods = prodService.allProducts();
        model.addAttribute("category", cat);
        model.addAttribute("products", prods);
        model.addAttribute("catProd", catProd);
        return "category";
    }

    @PostMapping("/categories/{id}/add")
    public String addProduct(@RequestParam("product")Long prodId, @PathVariable("id")Long id){
        Product product = prodService.finProduct(prodId);
        product.addCategory(catService.findCategory(id));
        prodService.updateProduct(product);
        return "redirect:/categories"+id;
    }

    @PostMapping("/products/{id}/add")
    public String addCategory(@RequestParam("category") Long catId, @PathVariable("id") Long id){
        Category category = catService.findCategory(catId);
        category.addProduct(prodService.finProduct(id));
        catService.updCategory(category);
        return "redirect:/products/"+id;
    }
}
