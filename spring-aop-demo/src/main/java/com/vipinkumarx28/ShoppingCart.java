package com.vipinkumarx28;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(){
        System.out.println("Checkout method is called from shopping cart");
    }
}
