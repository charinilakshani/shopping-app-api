package com.charini.ccafe.repository;

import com.charini.ccafe.model.priceDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface priceDetailsRepo extends JpaRepository<priceDetails, Integer> {

    Optional<priceDetails> findByModelAndAndDamageAreaAndAndDamageType(String model, String damageType, String damageArea);
}
