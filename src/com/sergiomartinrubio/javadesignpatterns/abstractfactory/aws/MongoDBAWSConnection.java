package com.sergiomartinrubio.javadesignpatterns.abstractfactory;

import com.sergiomartinrubio.javadesignpatterns.factory.Connection;

public class MongoDBAWSConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB on AWS...");
    }
}
