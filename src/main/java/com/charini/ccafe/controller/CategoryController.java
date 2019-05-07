package com.charini.ccafe.controller;

import com.charini.ccafe.model.Category;
import com.charini.ccafe.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryRepository repo;

    @GetMapping
    public @ResponseBody
    Iterable<Category> getAllCategories() {
        System.out.println("Fetching all categories");
        return repo.findAll();
    }

    @PostMapping
    public Category addNewCategory(Category categories) {
        repo.save(categories);
        System.out.println(categories.getName() + " is added");
        return categories;
    }

}
