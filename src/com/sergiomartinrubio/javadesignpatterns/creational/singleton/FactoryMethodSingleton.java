package com.sergiomartinrubio.javadesignpatterns.creational.singleton;

public class FactoryMethodSingleton {


    private static FactoryMethodSingleton instance = new FactoryMethodSingleton();

    private int value;

    private FactoryMethodSingleton() {

    }

    public static FactoryMethodSingleton getInstance(){
        return instance;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
