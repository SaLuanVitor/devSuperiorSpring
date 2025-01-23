package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingCost {

    private double shipping;

    public void Shipping(Double basicCost) {

        if (basicCost < 100.0) {
            shipping = 20.0;
        } else if (basicCost >= 100.0 && basicCost < 200.0) {
            shipping = 12.00;
        } else {
            shipping = 0.0;
        }
    }

    public double getShipping() {
        return shipping;
    }

}
