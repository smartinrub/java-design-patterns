package com.sergiomartinrubio.javadesignpatterns.structural.decorator;

import java.security.NoSuchAlgorithmException;

public class HashDecorator implements Password {

    private Password password;

    public HashDecorator(Password password) {
        this.password = password;
    }

    @Override
    public String getPassword(String value) throws NoSuchAlgorithmException {
        return password.getPassword(value);
    }
}
