package com.charini.ccafe.repository;

import com.charini.ccafe.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

//    List<Cart> findByPId( int pId);
}
