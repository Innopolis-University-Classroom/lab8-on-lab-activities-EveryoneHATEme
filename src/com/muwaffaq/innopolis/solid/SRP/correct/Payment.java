package com.muwaffaq.innopolis.solid.SRP.correct;

public class Payment {

    double totals = 0;
    String token;
    Cart cart;

    Payment(Cart cart) {
        this.cart = cart;
    }

    void applyDiscount(int percentage) {
        totals = totals * percentage;
    }

    void calculateTotal() {
        for (Product product : cart.products)
            totals += product.price;
    }
}
