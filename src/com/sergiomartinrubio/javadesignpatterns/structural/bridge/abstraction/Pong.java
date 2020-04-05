package com.sergiomartinrubio.javadesignpatterns.structural.bridge.abstraction;

import com.sergiomartinrubio.javadesignpatterns.structural.bridge.implementation.Difficulty;

public class Pong extends Game {

    public Pong(Difficulty difficulty) {
        super(difficulty);
    }

    @Override
    public void run() {
        difficulty.play();
    }
}
