package com.sergiomartinrubio.javadesignpatterns.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Visitable> products = new ArrayList<>();
        products.add(new Computer(600));
        products.add(new DishWasher(600));
        products.add(new Computer(1200));
        products.add(new Computer(300));

        RewardPointsVisitor rewardPointsVisitor = new RewardPointsVisitor();

        products.forEach(product -> product.accept(rewardPointsVisitor));

        System.out.println(rewardPointsVisitor.getRewardPoints());
    }
}
