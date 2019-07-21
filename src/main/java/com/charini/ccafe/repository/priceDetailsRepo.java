package com.charini.ccafe.repository;

import com.charini.ccafe.model.priceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface priceDetailsRepo extends JpaRepository<priceDetails, Integer> {

    Optional<priceDetails> findAllByModelAndDamageTypeAndDamageArea(String model, String damageType,String damageArea);
}
