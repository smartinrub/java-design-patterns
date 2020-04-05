package com.sergiomartinrubio.javadesignpatterns.factory;

public class Client {

    public static void main(String[] args) {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection mysqlConnection = connectionFactory.getConnection("mysql");

        if (mysqlConnection != null) {
            mysqlConnection.connect();
        } else {
            System.out.println("Please, provide a valid DB type");
        }
    }
}
