package com.sergiomartinrubio.javadesignpatterns.structural.bridge.abstraction;

import com.sergiomartinrubio.javadesignpatterns.structural.bridge.implementation.Difficulty;

public class Arkanoid extends Game {

    public Arkanoid(Difficulty difficulty) {
        super(difficulty);
    }

    @Override
    public void run() {
        difficulty.play();
    }
}
