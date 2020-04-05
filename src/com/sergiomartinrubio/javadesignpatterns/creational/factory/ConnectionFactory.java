package com.sergiomartinrubio.javadesignpatterns.creational.factory;

public class ConnectionFactory {

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
