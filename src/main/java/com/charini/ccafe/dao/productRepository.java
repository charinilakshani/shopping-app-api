package com.charini.ccafe.dao;

import com.charini.ccafe.model.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface productRepository extends JpaRepository <products, Integer> {
}
