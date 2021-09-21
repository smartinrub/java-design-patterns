package com.sergiomartinrubio.javadesignpatterns.behavioural.visitor;

public interface Visitor {
    void visit(DishWasher dishWasher);

    void visit(Computer computer);
}
