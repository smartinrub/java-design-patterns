package com.sergiomartinrubio.javadesignpatterns.behavioural.visitor;

public interface Visitor {
    void visit(DishWasher car);

    void visit(Computer motorcycle);
}
