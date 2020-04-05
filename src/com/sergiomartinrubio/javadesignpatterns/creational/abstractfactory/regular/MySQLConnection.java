package com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.regular;

import com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.Connection;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }
}
