package com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.aws;

import com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.Connection;

public class MySQLAWSConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL on AWS...");
    }
}
