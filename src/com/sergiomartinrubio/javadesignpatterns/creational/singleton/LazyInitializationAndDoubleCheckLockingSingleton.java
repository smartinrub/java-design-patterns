package com.sergiomartinrubio.javadesignpatterns.creational.singleton;

public class LazyInitializationAndDoubleCheckLockingSingleton {

    private static volatile LazyInitializationAndDoubleCheckLockingSingleton instance;

    private int value;

    private LazyInitializationAndDoubleCheckLockingSingleton() {

    }

    public static LazyInitializationAndDoubleCheckLockingSingleton getInstance() {
        if (instance == null) { // 1st check

            synchronized (LazyInitializationAndDoubleCheckLockingSingleton.class) {

                if (instance == null) { // 2nd check
                    instance = new LazyInitializationAndDoubleCheckLockingSingleton();
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
