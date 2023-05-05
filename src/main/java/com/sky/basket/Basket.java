package com.sky.basket;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
@SessionScope
@Component
public class Basket {
    private final List<Integer> goods;

    public List<Integer> getBasket() {
        return goods;
    }
    public Basket(List<Integer> goods) {
        this.goods = goods;
    }
}
