package com.sergiomartinrubio.javadesignpatterns.structural.adapter;

/**
 * Adaptee
 */
public class ExistingFullNameConverter {

    public String toUpperCase(String fullName) {
        return fullName.toUpperCase();
    }
}
