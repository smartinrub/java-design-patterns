package com.sergiomartinrubio.javadesignpatterns.structural.facade;

import java.util.UUID;

public class OrderProcessor implements Action {

    @Override
    public void doAction(UUID orderId) {
        System.out.println("Processing order " + orderId);
    }
}
