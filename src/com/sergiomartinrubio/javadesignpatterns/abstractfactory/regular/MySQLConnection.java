package com.sergiomartinrubio.javadesignpatterns.abstractfactory;

import com.sergiomartinrubio.javadesignpatterns.factory.Connection;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }
}
