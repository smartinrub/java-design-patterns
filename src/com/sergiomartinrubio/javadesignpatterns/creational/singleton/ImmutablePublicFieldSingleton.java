package com.sergiomartinrubio.javadesignpatterns.creational.singleton;

public class SingletonWithImmutablePublicField {

    public static final SingletonWithImmutablePublicField instance = new SingletonWithImmutablePublicField();

    private int value;

    private SingletonWithImmutablePublicField() {
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
