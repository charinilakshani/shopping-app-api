package com.charini.ccafe.repository;


import com.charini.ccafe.model.vehicleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleDetailsRepo extends JpaRepository<vehicleDetails, Integer> {

    Optional<vehicleDetails> findByClaimId(Integer claimId);
}
