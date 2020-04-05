package com.sergiomartinrubio.javadesignpatterns.structural.bridge.abstraction;

import com.sergiomartinrubio.javadesignpatterns.structural.bridge.implementation.Difficulty;

public class MinesSweeper extends Game {

    public MinesSweeper(Difficulty difficulty) {
        super(difficulty);
    }

    @Override
    public void run() {
        difficulty.play();
    }
}
