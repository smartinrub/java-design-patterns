package com.sergiomartinrubio.javadesignpatterns.structural.decorator;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Decorator extends HashDecorator {

    public MD5Decorator(Password password) {
        super(password);
    }

    @Override
    public String getPassword(String value) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(value.getBytes());
        byte[] digest = messageDigest.digest();
        return super.getPassword(DatatypeConverter.printHexBinary(digest));
    }
}
