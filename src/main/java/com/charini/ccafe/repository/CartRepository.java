package com.charini.ccafe.repository;

import com.charini.ccafe.model.Cart;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {



     List <Cart> findAllByUserId(int userId);
}
