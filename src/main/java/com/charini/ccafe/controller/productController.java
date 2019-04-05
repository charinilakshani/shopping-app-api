package com.charini.ccafe.controller;

import com.charini.ccafe.dao.productRepository;
import com.charini.ccafe.model.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class productController {

    @Autowired
    productRepository repo;


    @PostMapping("/addProduct")
    public products addNewProduct(@RequestBody products product) {
        repo.save(product);
        System.out.println(product.getProductName() + " is added");
        return product;
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<products> getAllProducts() {
        System.out.println("Fetching all products");
        return repo.findAll();
    }

    @GetMapping("{aid}")
    @ResponseBody
    public Optional<products> getUser(@PathVariable("aid") int aid) {
        System.out.println("wooooooo");
        return repo.findById(aid);
    }

    @PutMapping(path = "/update")
    public products updateProduct(@RequestBody products product) {
        System.out.println("working from back end");
        return repo.save(product);
    }
}
