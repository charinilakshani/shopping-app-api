package com.charini.ccafe.controller;

import com.charini.ccafe.model.Cart;
import com.charini.ccafe.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    CartRepository repo;

    @PostMapping
    public Cart addToCart(@RequestBody Cart cart) {

        int pId = cart.getpId();
        boolean c = repo.existsById(pId);

        System.out.println("Cart updated" + c);
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
//    public Optional<Cart> getOneCart(@PathVariable("cartId") int cartid) {
//        System.out.println("one by one is working");
//        return repo.findById(cartid);
//    }



    @GetMapping
    public Iterable<Cart> getAllProducts() {
        System.out.println("Fetching all Product");
        return repo.findAll();
    }

    @PutMapping
    public Cart updateCart(@RequestBody Cart cart)
    {
        return repo.save(cart);
    }

    @GetMapping("/{pId}")
    public Optional<Cart> getoneaddTocartProduct(@PathVariable("pId") int pid) {
        System.out.println("check Cart is exists or not");
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

 @PostMapping(path = "add/items")
    public Iterable<Cart> AddItemsToCart(@RequestBody Iterable<Cart> items){
        return repo.saveAll(items);
    }
  

}









