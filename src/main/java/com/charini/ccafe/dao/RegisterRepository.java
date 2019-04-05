package com.charini.ccafe.dao;

import java.util.List;

import com.charini.ccafe.model.registerUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<registerUsers, Integer> {
    List<registerUsers> findByEmail(String email);
}


