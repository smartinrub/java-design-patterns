package com.sergiomartinrubio.javadesignpatterns.behavioural.command.commands;

import com.sergiomartinrubio.javadesignpatterns.behavioural.command.Policy;

import java.util.UUID;

public class CancelPolicy implements Command {

    private Policy policy;

    public CancelPolicy(Policy policy) {
        this.policy = policy;
    }

    @Override
    public void execute(UUID policyId) {
        policy.cancel(policyId);
    }
}
