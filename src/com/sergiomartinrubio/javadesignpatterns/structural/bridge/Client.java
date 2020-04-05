package com.sergiomartinrubio.javadesignpatterns.structural.bridge;

import com.sergiomartinrubio.javadesignpatterns.structural.bridge.abstraction.Arkanoid;
import com.sergiomartinrubio.javadesignpatterns.structural.bridge.abstraction.Game;
import com.sergiomartinrubio.javadesignpatterns.structural.bridge.abstraction.MinesSweeper;
import com.sergiomartinrubio.javadesignpatterns.structural.bridge.abstraction.Pong;
import com.sergiomartinrubio.javadesignpatterns.structural.bridge.implementation.Easy;
import com.sergiomartinrubio.javadesignpatterns.structural.bridge.implementation.Hard;
import com.sergiomartinrubio.javadesignpatterns.structural.bridge.implementation.Medium;

public class Client {
    public static void main(String[] args) {
        Game minesweeper = new MinesSweeper(new Easy());
        minesweeper.run();

        Game pong = new Pong(new Hard());
        pong.run();

        Game arkanoid = new Arkanoid(new Medium());
        arkanoid.run();
    }
}
