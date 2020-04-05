package com.sergiomartinrubio.javadesignpatterns.structural.bridge.implementation;

public class Easy implements Difficulty {
    @Override
    public void play() {
        System.out.println("EASY mode enabled");
    }
}
