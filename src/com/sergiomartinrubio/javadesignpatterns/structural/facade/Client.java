package com.sergiomartinrubio.javadesignpatterns.structural.facade;

import java.util.UUID;

public class Client {

    public static final UUID ORDER_ID = UUID.randomUUID();

    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.createOrder(ORDER_ID);
        orderFacade.calculateOrderPrice(ORDER_ID);
        orderFacade.processOrder(ORDER_ID);
    }
}
