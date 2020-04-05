package com.sergiomartinrubio.javadesignpatterns.abstractfactory;

import com.sergiomartinrubio.javadesignpatterns.factory.Connection;

public class MySQLAWSConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL on AWS...");
    }
}
