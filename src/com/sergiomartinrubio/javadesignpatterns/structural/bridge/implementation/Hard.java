package com.sergiomartinrubio.javadesignpatterns.structural.bridge.implementation;

public class Hard implements Difficulty {
    @Override
    public void play() {
        System.out.println("HARD mode enabled");
    }
}
