package com.sergiomartinrubio.javadesignpatterns.behavioural.command.commands;

import java.util.UUID;

public interface Command {
    void execute(UUID policyId);
}
