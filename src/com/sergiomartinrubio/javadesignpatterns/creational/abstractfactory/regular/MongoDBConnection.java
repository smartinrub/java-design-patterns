package com.sergiomartinrubio.javadesignpatterns.abstractfactory.regular;

import com.sergiomartinrubio.javadesignpatterns.abstractfactory.Connection;

public class MongoDBConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB...");
    }
}
