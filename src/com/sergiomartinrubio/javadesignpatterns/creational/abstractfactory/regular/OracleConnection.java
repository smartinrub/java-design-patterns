package com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.regular;

import com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.Connection;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle...");
    }
}
