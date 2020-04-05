package com.sergiomartinrubio.javadesignpatterns.structural.facade;

import java.util.UUID;

public class OrderPriceCalculator implements Action {

    @Override
    public void doAction(UUID orderId) {
        System.out.println("Calculation price for order " + orderId);
    }
}
