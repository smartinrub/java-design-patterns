package com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.regular;

import com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.Connection;

public class MongoDBConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB...");
    }
}
