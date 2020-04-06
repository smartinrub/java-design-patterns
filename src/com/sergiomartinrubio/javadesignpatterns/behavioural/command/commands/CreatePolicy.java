package com.sergiomartinrubio.javadesignpatterns.behavioural.command.commands;

import com.sergiomartinrubio.javadesignpatterns.behavioural.command.Policy;

import java.util.UUID;

public class CreatePolicy implements Command {

    private Policy policy;

    public CreatePolicy(Policy policy) {
        this.policy = policy;
    }

    @Override
    public void execute(UUID policyId) {
        policy.create(policyId);
    }
}
