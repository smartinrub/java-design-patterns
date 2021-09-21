package com.sergiomartinrubio.javadesignpatterns.structural.decorator;

//import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1Decorator extends HashDecorator {

    public SHA1Decorator(Password password) {
        super(password);
    }

    @Override
    public String getPassword(String value) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(value.getBytes());
        byte[] digest = messageDigest.digest();
//        return super.getPassword(DatatypeConverter.printHexBinary(digest));
        return null;
    }
}
