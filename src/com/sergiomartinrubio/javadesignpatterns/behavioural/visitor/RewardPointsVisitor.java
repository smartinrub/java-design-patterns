package com.sergiomartinrubio.javadesignpatterns.behavioural.visitor;

public class RewardPointsVisitor implements Visitor {
    private double rewardPoints; // stores local state

    @Override
    public void visit(DishWasher dishWasher) {
        if (dishWasher.getPrice() > 500) {
            rewardPoints += dishWasher.getPrice() * 2;
        } else {
            rewardPoints += dishWasher.getPrice();
        }
    }

    @Override
    public void visit(Computer computer) {
        if (computer.getPrice() > 1000) {
            rewardPoints += computer.getPrice() * 3;
        } else {
            rewardPoints += computer.getPrice();
        }
    }

    public double getRewardPoints() {
        return rewardPoints;
    }
}
