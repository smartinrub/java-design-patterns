package com.sergiomartinrubio.javadesignpatterns.abstractfactory;

public interface ConnectionAbstractFactory {
    Connection getConnection(String connectionType);
}
