package com.charini.ccafe.service;

import com.charini.ccafe.model.User;
import com.charini.ccafe.model.UserPrincipal;
import com.charini.ccafe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

       Optional<User> user =userRepository.findByEmail(s);
       if(user ==null)
           throw  new UsernameNotFoundException("User 404");
       return new UserPrincipal(user.get());

    }
}
