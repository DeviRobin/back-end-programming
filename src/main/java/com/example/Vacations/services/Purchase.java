package com.example.Vacations.services;

import com.example.Vacations.entities.Cart;
import com.example.Vacations.entities.CartItem;
import com.example.Vacations.entities.Customer;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Purchase {

    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;
}
// customer, Cart, CartItems