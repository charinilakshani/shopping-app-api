package com.charini.ccafe.repository;

import java.util.List;
import java.util.Optional;

import com.charini.ccafe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
//    Optional<User> findByEmailAndPassword(String email, String password);
}


