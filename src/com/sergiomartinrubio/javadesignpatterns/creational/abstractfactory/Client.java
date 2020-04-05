package com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {

        ConnectionAbstractFactory awsConnectionFactory = FactoryCreator.getConnectionFactory(true);
        Connection mysqlAwsConnection = awsConnectionFactory.getConnection("mysql");

        if (mysqlAwsConnection != null) {
            mysqlAwsConnection.connect();
        } else {
            System.out.println("Please, provide a valid DB type");
        }

        ConnectionAbstractFactory regularConnectionFactory = FactoryCreator.getConnectionFactory(false);
        Connection mysqlRegularConnection = regularConnectionFactory.getConnection("mysql");

        if (mysqlRegularConnection != null) {
            mysqlRegularConnection.connect();
        } else {
            System.out.println("Please, provide a valid DB type");
        }
    }
}
