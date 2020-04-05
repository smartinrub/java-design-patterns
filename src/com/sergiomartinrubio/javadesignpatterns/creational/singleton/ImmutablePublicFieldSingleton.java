package com.sergiomartinrubio.javadesignpatterns.creational.singleton;

public class ImmutablePublicFieldSingleton {

    public static final ImmutablePublicFieldSingleton instance = new ImmutablePublicFieldSingleton();

    private int value;

    private ImmutablePublicFieldSingleton() {
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
