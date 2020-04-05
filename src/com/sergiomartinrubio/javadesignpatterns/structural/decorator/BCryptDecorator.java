package com.sergiomartinrubio.javadesignpatterns.structural.decorator;

import org.mindrot.jbcrypt.BCrypt;

import java.security.NoSuchAlgorithmException;

public class BCryptDecorator extends HashDecorator {

    public BCryptDecorator(Password password) {
        super(password);
    }

    @Override
    public String getPassword(String value) throws NoSuchAlgorithmException {
        return super.getPassword(BCrypt.hashpw(value, BCrypt.gensalt()));
    }
}
