package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingCost shippingCost;

    @Autowired
    private Discount discount;

    public OrderService(ShippingCost shippingCost, Discount discount) {
        this.shippingCost = shippingCost;
        this.discount = discount;
    }

    public double orderCost(Order Order) {

        shippingCost.Shipping(Order.getBasic());
        discount.calculateDiscount(Order.getBasic(), Order.getDiscount());
        return shippingCost.getShipping() + discount.getFinalPrice();
    }

}
