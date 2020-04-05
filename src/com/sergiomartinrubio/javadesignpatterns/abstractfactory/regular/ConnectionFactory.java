package com.sergiomartinrubio.javadesignpatterns.abstractfactory;

public class AWSConnectionFactory implements ConnectionAbstractFactory {
    @Override
    public Connection getConnection(String connectionType) {
        switch (connectionType) {
            case "mysql":
                return new MySQLAWSConnection();
            case "mongodb":
                return new MongoDBAWSConnection();
            case "oracle":
                return new OracleAWSConnection();
            default:
                return null;
        }
    }
}
