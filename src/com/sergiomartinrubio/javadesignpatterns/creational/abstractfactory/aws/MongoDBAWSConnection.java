package com.sergiomartinrubio.javadesignpatterns.abstractfactory.aws;

import com.sergiomartinrubio.javadesignpatterns.abstractfactory.Connection;

public class MongoDBAWSConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB on AWS...");
    }
}
