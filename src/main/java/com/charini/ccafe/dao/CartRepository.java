package com.charini.ccafe.dao;

import com.charini.ccafe.model.cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<cart, Integer> {

//    List<cart> findByPId( int pId);
}
