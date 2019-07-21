package com.charini.ccafe.controller;

import com.charini.ccafe.model.vehicleDetails;
import com.charini.ccafe.repository.VehicleDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/details/")
public class vehicleDetailsController {

    @Autowired
    VehicleDetailsRepo repo;

    @GetMapping("{claimId}")
    @ResponseBody
    public vehicleDetails getByClaimId(@PathVariable int claimId) {
        System.out.println("working ");
        return repo.findByClaimId(claimId).get();
    }

    @GetMapping
    public @ResponseBody
    Iterable<vehicleDetails> getAll() {
        System.out.println("Fetching all client");
        return repo.findAll();
    }


}