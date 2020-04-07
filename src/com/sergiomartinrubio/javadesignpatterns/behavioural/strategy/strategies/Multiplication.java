package com.sergiomartinrubio.javadesignpatterns.behavioural.strategy.strategies;

public class Multiplication implements Operation {
    @Override
    public int doOperation(int number1, int number2) {
        return number1 * number2;
    }
}
