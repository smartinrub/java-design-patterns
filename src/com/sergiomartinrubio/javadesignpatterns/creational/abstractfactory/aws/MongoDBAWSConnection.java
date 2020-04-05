package com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.aws;

import com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.Connection;

public class MongoDBAWSConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB on AWS...");
    }
}
