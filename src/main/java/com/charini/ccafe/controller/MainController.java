package com.charini.ccafe.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.charini.ccafe.dao.RegisterRepository;
import com.charini.ccafe.model.registerUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class MainController {

    @Autowired
    RegisterRepository repo;

    @RequestMapping("/")
    public String gethome() {
        System.out.println("hello world12");
        return "register.jsp";
    }

    @PostMapping("/addUser")
    public String adduser(@RequestBody registerUsers user) {
        repo.save(user);
        return "register.jsp";

    }

//	@GetMapping("/getUser/{aid}")
//	@ResponseBody
//	public Optional<registerUsers> getuser( @PathVariable("aid") int aid ) {
////		System.out.println(aid);
////		ModelAndView mv = new ModelAndView("ViewProduct.jsp");
////		registerUsers  user = repo.findById(aid).orElse(new registerUsers());
//		System.out.println(repo.findByEmail("charinilakshani@gmail.com"));
////		mv.addObject(user);
//		
//		return repo.findById(aid);
//		
//	}


    //
//   
//    	@RequestMapping("/")
//    	public String register (  ) {
//    		System.out.println("working");
//    		return "register.jsp";
//    		
//    	}
////    	@RequestMapping("/addUser")
////    	public String adduser(registerUser user) {
////    		System.out.println("wooooooo" + user);
////    		
////    		repo.save(user);
////    		return"register.jsp";
////    	}
//    	
//    	@PostMapping("/User")
//    	public registerUsers adduser(registerUsers user) {
//    		System.out.println("wooooooo" + user);
//    		repo.save(user);
//    		return user;
//    	}
    @GetMapping(path = "/users")
    public @ResponseBody
    Iterable<registerUsers> getUsers() {
        System.out.println("wooooooo");

        System.out.println(repo.findAll());
        return repo.findAll();
    }
//    
//   	  @GetMapping(path = "/getAll")

//	@RequestMapping("/user/{aid}")
//   	@ResponseBody
//  	public Optional<registerUsers> getUser(@PathVariable("aid") int aid) {
//  		System.out.println("wooooooo");
////    		ModelAndView mv =  new ModelAndView("viewUsers.jsp");
////    		registerUser user = repo.findById(aid).orElse(new registerUser());
////    		System.out.println(user);
////    		mv.addObject(user);
////    		return mv;
////    		System.out.println(repo.findAll().toString());
//    		return  repo.findById(aid);
//    	}
//    	


}
