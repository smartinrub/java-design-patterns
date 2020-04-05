package com.sergiomartinrubio.javadesignpatterns.creational.abstractfactory;

public interface ConnectionAbstractFactory {
    Connection getConnection(String connectionType);
}
