package com.sergiomartinrubio.javadesignpatterns.behavioural.visitor;

public class DishWasher implements Visitable {
    private final double price;

    public DishWasher(double price) {
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
