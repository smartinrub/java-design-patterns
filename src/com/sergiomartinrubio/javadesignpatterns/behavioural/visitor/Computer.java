package com.sergiomartinrubio.javadesignpatterns.behavioural.visitor;

public class Computer implements Visitable {
    private final double price;

    public Computer(double price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}
