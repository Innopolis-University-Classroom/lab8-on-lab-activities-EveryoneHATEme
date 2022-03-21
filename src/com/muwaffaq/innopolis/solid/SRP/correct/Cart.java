package com.muwaffaq.innopolis.solid.SRP.correct;

import java.util.List;


public class Cart {

    List<Product> products;

    void addToCart(Product product) {
        products.add(product);
    }

    void removeFromCart(Product product) {
        products.remove(product);
    }
}



