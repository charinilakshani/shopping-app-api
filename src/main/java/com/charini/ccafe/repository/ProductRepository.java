package com.charini.ccafe.repository;

import com.charini.ccafe.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository <Product, Integer> {



    Optional<Product> getAllByProductCategory(String productCategory);
}
