package com.charini.ccafe.controller;

import com.charini.ccafe.model.priceDetails;
import com.charini.ccafe.repository.priceDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/")
public class PriceController {

    @Autowired
    priceDetailsRepo repo;

    @GetMapping("/byBoth/{model}/{damageType}/{damageArea}")
    @ResponseBody
    public priceDetails getbyModelType(@PathVariable String model, @PathVariable  String damageType, @PathVariable  String damageArea) {
        System.out.println("check Cart is exists or not");
        return repo.findByModelAndAndDamageAreaAndAndDamageType(model ,damageType,damageArea).get();
    }
}