package com.sergiomartinrubio.javadesignpatterns.behavioural.strategy;

import com.sergiomartinrubio.javadesignpatterns.behavioural.strategy.strategies.Addition;
import com.sergiomartinrubio.javadesignpatterns.behavioural.strategy.strategies.Division;
import com.sergiomartinrubio.javadesignpatterns.behavioural.strategy.strategies.Multiplication;
import com.sergiomartinrubio.javadesignpatterns.behavioural.strategy.strategies.Subtraction;

public class Client {

    public static final int NUM1 = 15;
    public static final int NUM2 = 3;

    public static void main(String[] args) {
        System.out.println("Do Addition Operation...");
        CalculatorContext calculator = new CalculatorContext(new Addition());
        System.out.println(NUM1 + " + " + NUM2 + ": " + calculator.executeStrategy(NUM1, NUM2));

        System.out.println("Do Substration Operation...");
        calculator = new CalculatorContext(new Subtraction());
        System.out.println(NUM1 + " - " + NUM2 + ": " + calculator.executeStrategy(NUM1, NUM2));

        System.out.println("Do Division Operation...");
        calculator = new CalculatorContext(new Division());
        System.out.println(NUM1 + " / " + NUM2 + ": " + calculator.executeStrategy(NUM1, NUM2));

        System.out.println("Do Multiplication Operation...");
        calculator = new CalculatorContext(new Multiplication());
        System.out.println(NUM1 + " * " + NUM2 + ": " + calculator.executeStrategy(NUM1, NUM2));


    }
}
