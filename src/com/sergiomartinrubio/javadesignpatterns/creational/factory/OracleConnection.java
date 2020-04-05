package com.sergiomartinrubio.javadesignpatterns.creational.factory;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle...");
    }
}
