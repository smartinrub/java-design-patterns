package com.sergiomartinrubio.javadesignpatterns.creational.singleton;

public class LazyInitializationAndDoubleCheckLocking {

    private static volatile LazyInitializationAndDoubleCheckLocking instance;

    private int value;

    private LazyInitializationAndDoubleCheckLocking() {

    }

    public static LazyInitializationAndDoubleCheckLocking getInstance() {
        if (instance == null) { // 1st check

            synchronized (LazyInitializationAndDoubleCheckLocking.class) {

                if (instance == null) { // 2nd check
                    instance = new LazyInitializationAndDoubleCheckLocking();
                }
            }
        }
        return instance;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
