package com.sergiomartinrubio.javadesignpatterns.structural.bridge.implementation;

public class Medium implements Difficulty {
    @Override
    public void play() {
        System.out.println("MEDIUM mode enabled");
    }
}
