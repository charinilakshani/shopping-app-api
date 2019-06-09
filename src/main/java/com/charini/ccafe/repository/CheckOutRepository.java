package com.charini.ccafe.repository;


import com.charini.ccafe.model.CheckOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CheckOutRepository extends JpaRepository<CheckOut, Integer> {
    List<CheckOut> findAllByUserId(int userId);
    void deleteAllByUserId(int userId);
}

