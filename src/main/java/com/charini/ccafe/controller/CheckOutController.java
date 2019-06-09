package com.charini.ccafe.controller;

import com.charini.ccafe.model.Cart;
import com.charini.ccafe.model.CheckOut;
import com.charini.ccafe.repository.CheckOutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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


//    @PostMapping
//    public CheckOut adduser(@RequestBody CheckOut checkOut) {
//        repo.save(checkOut);
//        return checkOut ;
//    }


    @Transactional
    @DeleteMapping("/deleteAll/{userId}")
    public void deleteCheckOut(@PathVariable int userId ) {

        repo.deleteAllByUserId(userId);

    }
}

