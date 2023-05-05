package com.sky.basket.services;

import com.sky.basket.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    Basket basket;

    @Autowired
    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }
    @Override
    public void add(int... id) {
        for (int g : id) {
            basket.getBasket().add(g);
        }
    }

    @Override
    public List<Integer> get() {
        return basket.getBasket();
    }
}
