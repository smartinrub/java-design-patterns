package com.sergiomartinrubio.javadesignpatterns.abstractfactory.aws;

import com.sergiomartinrubio.javadesignpatterns.abstractfactory.Connection;
import com.sergiomartinrubio.javadesignpatterns.abstractfactory.ConnectionAbstractFactory;

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
