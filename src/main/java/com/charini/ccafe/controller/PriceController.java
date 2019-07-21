package com.charini.ccafe.controller;

import com.charini.ccafe.model.priceDetails;
import com.charini.ccafe.repository.priceDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/price")
public class PriceController {

    @Autowired
    priceDetailsRepo repo;

    @GetMapping("/byBoth/{model}/{damageType}")
    @ResponseBody
    public priceDetails getbyModelType(@PathVariable String model, @PathVariable  String damageType) {
        System.out.println("check Cart is exists or not");
        return repo.findByModelAndAndDamageArea(model,damageType).get();
    }
}