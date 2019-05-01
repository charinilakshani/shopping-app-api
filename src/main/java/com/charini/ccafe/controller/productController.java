package com.charini.ccafe.controller;

import com.charini.ccafe.dao.productRepository;
import com.charini.ccafe.model.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class productController {

    @Autowired
    productRepository repo;


    @PostMapping
    public products addNewProduct(@RequestBody products product) {
        repo.save(product);
        System.out.println(product.getProductName() + " is added");
        return product;
    }

    @GetMapping
    public @ResponseBody
    Iterable<products> getAllProducts() {
        System.out.println("Fetching all products");
        return repo.findAll();
    }

    @GetMapping("{pId}")
    @ResponseBody
    public Optional<products> getOneProduct(@PathVariable("pId") int pid) {
        System.out.println("wooooooo");
        return repo.findById(pid);
    }

    @PutMapping
    public products updateProduct(@RequestBody products product) {
        System.out.println("working from back end");
        return repo.save(product);
    }
}
