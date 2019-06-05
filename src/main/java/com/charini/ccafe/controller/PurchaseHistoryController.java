package com.charini.ccafe.controller;


import com.charini.ccafe.model.CheckOut;
import com.charini.ccafe.model.PurchaseHistory;
import com.charini.ccafe.repository.PurchaseHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("user/history")
public class PurchaseHistoryController {

    @Autowired
    PurchaseHistoryRepository repo;


    @PostMapping
    public Iterable<PurchaseHistory> AddHsitory(@RequestBody Iterable<PurchaseHistory> hisitory) {
        return repo.saveAll(hisitory);
    }

    @GetMapping("/{userId}")
    public List<PurchaseHistory> getByUserId(@PathVariable("userId") int userId) {
        return repo.findAllByUserId(userId);
    }

}
