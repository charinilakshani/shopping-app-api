package com.charini.ccafe.controller;

import com.charini.ccafe.dao.CartRepository;
import com.charini.ccafe.model.cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartRepository repo;

    @PostMapping("/addToCart")
    public cart addToCart(@RequestBody cart cart) {

        int pId = cart.getpId();
        boolean c = repo.existsById(pId);

        System.out.println("cart updated" + c);
        if (c == false) {
            return repo.save(cart);
        } else {
            System.out.println(" perfectly working" + c);
            int quant = cart.getQuantity();
            int quantity = quant + 1;
            System.out.println("Quntity" + quantity);
            // call update method;
            return repo.save(cart);
        }
    }


//    @GetMapping("{cartId}")
//    @ResponseBody
//    public Optional<cart> getOneCart(@PathVariable("cartId") int cartid) {
//        System.out.println("one by one is working");
//        return repo.findById(cartid);
//    }



    @GetMapping(path = "/allCart")
    public @ResponseBody
    Iterable<cart> getAllProducts() {
        System.out.println("Fetching all products");
        return repo.findAll();
    }

    @PutMapping
    public cart updateCart(@RequestBody cart cart)
    {
        return repo.save(cart);
    }

    @GetMapping("{pId}")
    @ResponseBody
    public Optional<cart> getoneaddTocartProduct(@PathVariable("pId") int pid) {
        System.out.println("check cart is exists or not");
        return repo.findById(pid);
    }


    @DeleteMapping(path="/{id}")
    public boolean deleteCart(@PathVariable int id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }

}









