package com.sergiomartinrubio.javadesignpatterns.structural.facade;

import java.util.UUID;

public interface Action {
    void doAction(UUID orderId);
}
