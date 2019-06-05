package com.charini.ccafe.repository;

import com.charini.ccafe.model.PurchaseHistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Integer> {

    List<PurchaseHistory> findAllByUserId(int userId);
}
