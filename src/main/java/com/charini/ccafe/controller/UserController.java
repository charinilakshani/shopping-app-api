package com.charini.ccafe.controller;

import java.util.List;
import java.util.Optional;

import com.charini.ccafe.model.Users;
import com.charini.ccafe.repository.UserRepository;
import com.charini.ccafe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserRepository repo;

    @PostMapping
    public User adduser(@RequestBody User user) {
        repo.save(user);
        return user ;
    }

    @GetMapping("{email}")
    @ResponseBody
    public User  getOnebyemail(@PathVariable String email, String password) {
        System.out.println("search user id");
//        repo.findByEmail(email);
        return repo.findByEmail(email).get();
    }

//  @GetMapping("/{uid}")
//    public User getUser(@PathVariable String uid){
//        return repo.findById(uid).get();
//    }

    @GetMapping("users/{userId}")
    public Optional<User> getOneProduct(@PathVariable int userId) {
        return repo.findById(userId);
    }
    @GetMapping
    public @ResponseBody
    Iterable<User> getUsers() {
    return repo.findAll();
    }


}
