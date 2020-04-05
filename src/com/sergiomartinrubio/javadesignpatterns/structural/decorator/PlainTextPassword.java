package com.sergiomartinrubio.javadesignpatterns.structural.decorator;

public class PlainTextPassword implements Password {
    @Override
    public String getPassword(String value) {
        return value;
    }
}
