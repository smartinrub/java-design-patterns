package com.sergiomartinrubio.javadesignpatterns.factory;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }
}
