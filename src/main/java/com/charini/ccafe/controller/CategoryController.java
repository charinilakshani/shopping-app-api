package com.charini.ccafe.controller;

import com.charini.ccafe.dao.categoryRepository;
import com.charini.ccafe.model.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    categoryRepository repo;

    @GetMapping
    public @ResponseBody
    Iterable<category> getAllCategories() {
        System.out.println("Fetching all categories");
        return repo.findAll();
    }

    @PostMapping
    public category addNewCategory(category categories) {
        repo.save(categories);
        System.out.println(categories.getName() + " is added");
        return categories;
    }

}
