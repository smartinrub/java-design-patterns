package com.sergiomartinrubio.javadesignpatterns.structural.decorator;

import java.security.NoSuchAlgorithmException;

public interface Password {
    String getPassword(String value) throws NoSuchAlgorithmException;
}
