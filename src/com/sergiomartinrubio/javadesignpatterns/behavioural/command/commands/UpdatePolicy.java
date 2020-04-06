package com.sergiomartinrubio.javadesignpatterns.behavioural.command.commands;

import com.sergiomartinrubio.javadesignpatterns.behavioural.command.Policy;

import java.util.UUID;

public class UpdatePolicy implements Command {

    private Policy policy;

    public UpdatePolicy(Policy policy) {
        this.policy = policy;
    }

    @Override
    public void execute(UUID policyId) {
        policy.update(policyId);
    }
}
