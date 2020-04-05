package com.sergiomartinrubio.javadesignpatterns.structural.facade;

import java.util.UUID;

public class OrderCreation implements Action {

    @Override
    public void doAction(UUID orderId) {
        System.out.println("Creating order " + orderId + " on the system.");
    }
}
