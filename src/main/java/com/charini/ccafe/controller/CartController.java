package com.charini.ccafe.controller;

import com.charini.ccafe.model.Cart;
import com.charini.ccafe.model.User;
import com.charini.ccafe.model.Users;
import com.charini.ccafe.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@CrossOrigin()
@RestController
@RequestMapping("user/carts")
public class CartController {
    @Autowired
    CartRepository repo;

    @PostMapping
    public Cart addNewItemToCart(@RequestBody Cart newItem) {
        Cart cart = null;
        for (Cart cartItem : getAllCarts()) {
            //
            if (Objects.equals(cartItem.getpId(), newItem.getpId()) &&
                    Objects.equals(cartItem.getUserId(), newItem.getUserId())) {
                cart = cartItem;
            }
        }

        if (cart == null) {
            cart = newItem;
        } else {

            int qty = cart.getQuantity() + newItem.getQuantity();
            cart.setQuantity(qty);
        }
        repo.save(cart);
        System.out.println(cart.getUserId() + " PID"+ cart.getpId() +"CartId"+  cart.getCartId() + " added");

        return cart;
    }

    @GetMapping
    public Iterable<Cart> getAllCarts() {
        System.out.println("get al cart");
        return repo.findAll();
    }

    @PutMapping
    public Cart updateCart(@RequestBody Cart cart) {
        return repo.save(cart);
    }

    @GetMapping("/byId/{pId}")
    public Optional<Cart> getOneAddToCartProduct(@PathVariable("pId") int pid) {
        System.out.println("check Cart is exists or not");
        return repo.findById(pid);
    }

    @GetMapping("/byBoth/{userId}/{pId}")
    @ResponseBody
    public Cart getByUserIdAndPId(@PathVariable  int userId,@PathVariable  int pId) {
        System.out.println("check Cart is exists or not");
        return repo.findCartsByUserIdAndPId(userId ,pId).get();
    }



    @GetMapping("/{userId}")
    public List<Cart> getByUserId(@PathVariable("userId") int userId) {
        return repo.findAllByUserId(userId);
    }

    @DeleteMapping(path = "/{cartId}")
    public Iterable<Cart> deleteCart(@PathVariable int cartId) {
        repo.deleteById(cartId);
        System.out.println("deleted" + cartId);
        return repo.findAll();
    }

//
//    @DeleteMapping
//    public List<Cart> Delete(@RequestBody List<Cart> carts) {
//        System.out.println("deleted" + carts);
//        repo.deleteAll();
//       return repo.findAll();
//    }

    @PostMapping(path = "add/items")
    public Iterable<Cart> AddItemsToCart(@RequestBody Iterable<Cart> items) {
        return repo.saveAll(items);
    }


    @GetMapping(produces = "application/json")
    @RequestMapping({"/validateLogin"})
    public Users validateLogin() {
        return new Users("User successfully authenticated");
    }
}









