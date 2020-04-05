package com.sergiomartinrubio.javadesignpatterns.abstractfactory;

import com.sergiomartinrubio.javadesignpatterns.abstractfactory.aws.AWSConnectionFactory;
import com.sergiomartinrubio.javadesignpatterns.abstractfactory.regular.ConnectionFactory;

public class FactoryCreator {
    public static ConnectionAbstractFactory getConnectionFactory(boolean isAws) {
        if (isAws) {
            return new AWSConnectionFactory();
        } else {
            return new ConnectionFactory();
        }
    }
}
