package com.sergiomartinrubio.javadesignpatterns.behavioural.strategy;

import com.sergiomartinrubio.javadesignpatterns.behavioural.strategy.strategies.Operation;

public class CalculatorContext {

    private final Operation operation;

    public CalculatorContext(Operation operation) {
        this.operation = operation;
    }

    public int executeStrategy(int num1, int num2) {
        return operation.doOperation(num1, num2);
    }
}
