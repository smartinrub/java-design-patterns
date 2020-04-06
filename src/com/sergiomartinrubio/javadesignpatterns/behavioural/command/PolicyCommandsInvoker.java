package com.sergiomartinrubio.javadesignpatterns.behavioural.command;

import com.sergiomartinrubio.javadesignpatterns.behavioural.command.commands.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PolicyCommandsInvoker {

    private List<Command> commands = new ArrayList<>();

    public void takeCommand(Command command) {
        commands.add(command);
    }

    public void runCommands(UUID policyId) {
        for (Command command : commands) {
            command.execute(policyId);
        }
    }
}
