package com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.regular;

import com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.Connection;
import com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory.ConnectionAbstractFactory;

public class ConnectionFactory implements ConnectionAbstractFactory {
    @Override
    public Connection getConnection(String connectionType) {
        switch (connectionType) {
            case "mysql":
                return new MySQLConnection();
            case "mongodb":
                return new MongoDBConnection();
            case "oracle":
                return new OracleConnection();
            default:
                return null;
        }
    }
}
