package com.charini.ccafe.controller;

import com.charini.ccafe.model.Promotion;
import com.charini.ccafe.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/promotion")
public class PromotionController {

    @Autowired
    PromotionRepository repo;

    @GetMapping
    public @ResponseBody
    Iterable<Promotion> getAllPromotions(){
        return repo.findAll();
    }
}
