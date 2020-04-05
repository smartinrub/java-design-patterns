package com.sergiomartinrubio.javadesignpatterns.creational.factory;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }
}
