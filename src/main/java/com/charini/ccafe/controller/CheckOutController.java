package com.charini.ccafe.controller;

import com.charini.ccafe.model.Cart;
import com.charini.ccafe.model.CheckOut;
import com.charini.ccafe.repository.CheckOutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin()
@RestController
@RequestMapping("user/checkOut")

public class CheckOutController {

    @Autowired
    CheckOutRepository repo;

    @PostMapping
    public Iterable<CheckOut> AddItemsToCart(@RequestBody Iterable<CheckOut> products) {
        return repo.saveAll(products);
    }

    @GetMapping("/{userId}")
    public List<CheckOut> getByUserId(@PathVariable("userId") int userId) {
        return repo.findAllByUserId(userId);
    }
}

