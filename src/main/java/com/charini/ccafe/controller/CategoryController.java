package com.charini.ccafe.controller;

import com.charini.ccafe.dao.categoryRepository;
import com.charini.ccafe.model.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class CategoryController {
    @Autowired
    categoryRepository repo;

    @GetMapping(path = "/allcategory")
    public @ResponseBody
    Iterable<category> getAllProducts() {
        System.out.println("Fetching all products");
        return repo.findAll();
    }

    @PostMapping("/addcategory")
    public category addNewProduct(category categories) {

        repo.save(categories);
        System.out.println(categories.getName() + " is added");

        return categories;
    }

}
