package com.sergiomartinrubio.javadesignpatterns.behavioural.command;

import java.util.UUID;

public class Policy {

    public void create(UUID policyId) {
        System.out.println("Create policy " + policyId);
    }

    public void update(UUID policyId) {
        System.out.println("Update policy " + policyId);
    }

    public void cancel(UUID policyId) {
        System.out.println("Cancel policy " + policyId);
    }
}
