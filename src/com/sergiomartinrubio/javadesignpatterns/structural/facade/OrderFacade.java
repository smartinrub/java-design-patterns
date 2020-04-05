package com.sergiomartinrubio.javadesignpatterns.structural.facade;

import java.util.UUID;

public class OrderFacade {

    private OrderCreation orderCreation;
    private OrderPriceCalculator orderPriceCalculator;
    private OrderProcessor orderProcessor;

    public OrderFacade() {
        this.orderCreation = new OrderCreation();
        this.orderPriceCalculator = new OrderPriceCalculator();
        this.orderProcessor = new OrderProcessor();
    }

    public void createOrder(UUID orderId) {
        orderCreation.doAction(orderId);
    }

    public void calculateOrderPrice(UUID orderId) {
        orderPriceCalculator.doAction(orderId);
    }

    public void processOrder(UUID orderId) {
        orderProcessor.doAction(orderId);
    }
}
