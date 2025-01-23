package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class Discount {

    private double finalPrice;
    private double discountAmount;

    public void calculateDiscount(double originalPrice, double discountPercentage) {
        if (originalPrice < 0) {
            throw new IllegalArgumentException("O preço original não pode ser negativo.");
        }
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("A porcentagem de desconto deve estar entre 0 e 100.");
        }

        discountAmount = (originalPrice * discountPercentage) / 100;
        finalPrice = originalPrice - discountAmount;

    }

    public double getFinalPrice() {
        return finalPrice;
    }

}
