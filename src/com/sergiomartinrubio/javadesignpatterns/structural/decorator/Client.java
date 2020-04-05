package com.sergiomartinrubio.javadesignpatterns.structural.decorator;

import java.security.NoSuchAlgorithmException;

public class Client {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        Password password1 = new MD5Decorator(new PlainTextPassword());
        Password password2 = new SHA1Decorator(new PlainTextPassword());
        Password password3 = new BCryptDecorator(new PlainTextPassword());
        Password password4 = new MD5Decorator(new BCryptDecorator(new PlainTextPassword()));
        Password password5 = new SHA1Decorator(new MD5Decorator(new BCryptDecorator(new PlainTextPassword())));

        String hash1 = password1.getPassword("password");
        String hash2 = password2.getPassword("password");
        String hash3 = password3.getPassword("password");
        String hash4 = password4.getPassword("password");
        String hash5 = password5.getPassword("password");

        System.out.println("MD5: " + hash1);
        System.out.println("SHA-1: " + hash2);
        System.out.println("BCrypt: " + hash3);
        System.out.println("BCrypt of MD5: " + hash4);
        System.out.println("BCrypt of MD5 of SH1: " + hash5);
    }
}
