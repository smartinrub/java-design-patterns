package com.sergiomartinrubio.javadesignpatterns.abstractfactory;

import com.sergiomartinrubio.javadesignpatterns.factory.Connection;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle...");
    }
}
