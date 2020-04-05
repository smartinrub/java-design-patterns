package com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.aws;

import com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.Connection;

public class OracleAWSConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle on AWS...");
    }
}
