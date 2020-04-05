package com.sergiomartinrubio.javadesignpatterns.creational.singleton;

public class SingletonWithFactoryMethod {


    private static SingletonWithFactoryMethod instance = new SingletonWithFactoryMethod();

    private int value;

    private SingletonWithFactoryMethod() {

    }

    public static SingletonWithFactoryMethod getInstance(){
        return instance;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
