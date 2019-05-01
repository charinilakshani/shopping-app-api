package com.charini.ccafe.controller;

import java.util.List;

import com.charini.ccafe.dao.RegisterRepository;
import com.charini.ccafe.model.registerUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    RegisterRepository repo;

    @PostMapping
    public registerUsers adduser(@RequestBody registerUsers user) {
        repo.save(user);
        return user ;
    }

    @GetMapping("{email}")
    @ResponseBody
    public List<registerUsers> getOnebyemail(@PathVariable("email") String email) {
        System.out.println("search user id");
        repo.findByEmail(email);
        return repo.findByEmail(email);
    }
   
    @GetMapping
    public @ResponseBody
    Iterable<registerUsers> getUsers() {
    return repo.findAll();
    }


}
