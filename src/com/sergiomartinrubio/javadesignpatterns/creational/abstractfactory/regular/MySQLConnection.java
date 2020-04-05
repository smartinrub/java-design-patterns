package com.sergiomartinrubio.javadesignpatterns.abstractfactory.regular;

import com.sergiomartinrubio.javadesignpatterns.abstractfactory.Connection;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }
}
