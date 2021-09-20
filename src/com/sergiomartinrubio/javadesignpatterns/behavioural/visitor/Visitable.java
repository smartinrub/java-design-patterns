package com.sergiomartinrubio.javadesignpatterns.behavioural.visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
