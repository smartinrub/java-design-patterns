package com.sergiomartinrubio.javadesignpatterns.creational.factory;

public class MongoDBConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB...");
    }
}
