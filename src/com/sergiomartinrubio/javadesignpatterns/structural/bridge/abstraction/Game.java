package com.sergiomartinrubio.javadesignpatterns.structural.bridge.abstraction;

import com.sergiomartinrubio.javadesignpatterns.structural.bridge.implementation.Difficulty;

public abstract class Game {
    protected Difficulty difficulty;

    protected Game(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public abstract void run();
}
