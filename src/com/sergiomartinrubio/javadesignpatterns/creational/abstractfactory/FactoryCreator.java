package com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory;

import com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.aws.AWSConnectionFactory;
import com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.regular.ConnectionFactory;

public class FactoryCreator {
    public static ConnectionAbstractFactory getConnectionFactory(boolean isAws) {
        if (isAws) {
            return new AWSConnectionFactory();
        } else {
            return new ConnectionFactory();
        }
    }
}
