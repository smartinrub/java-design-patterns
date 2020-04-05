package com.sergiomartinrubio.javadesignpatterns.structural.adapter;

public class Client {

    public static void main(String[] args) {
        FullNameConverter fullNameConverter = new FullNameConverterAdapter(new ExistingFullNameConverter());

        System.out.println(fullNameConverter.toUpperCase("Sergio" , "Martin"));
    }
}
