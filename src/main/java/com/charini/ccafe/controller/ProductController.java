package com.charini.ccafe.controller;

import com.charini.ccafe.model.Product;
import com.charini.ccafe.model.UserPrincipal;
import com.charini.ccafe.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository repo;

    @PostMapping
    public Product addNewProduct(@RequestBody Product product) {
        return repo.save(product);
    }

    @GetMapping
    public Iterable<Product> getAllProducts() {
        return repo.findAll();
    }

    @GetMapping("/{pId}")
    public Optional<Product> getOneProduct(@PathVariable int pid) {
        return repo.findById(pid);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return repo.save(product);
    }

    @GetMapping("getByProductName/{productCategory}")
    public Optional<Product> getByProductName(@PathVariable String productCategory)
    {
        return repo.getAllByProductCategory(productCategory);
    }



}
