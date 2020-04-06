package com.sergiomartinrubio.javadesignpatterns.behavioural.command;

import com.sergiomartinrubio.javadesignpatterns.behavioural.command.commands.CancelPolicy;
import com.sergiomartinrubio.javadesignpatterns.behavioural.command.commands.CreatePolicy;
import com.sergiomartinrubio.javadesignpatterns.behavioural.command.commands.UpdatePolicy;

import java.util.UUID;

public class Client {

    public static void main(String[] args) {
        Policy policy = new Policy();

        CreatePolicy createPolicy = new CreatePolicy(policy);
        UpdatePolicy updatePolicy = new UpdatePolicy(policy);
        CancelPolicy cancelPolicy = new CancelPolicy(policy);

        PolicyCommandsInvoker policyCommandsInvoker = new PolicyCommandsInvoker();
        policyCommandsInvoker.takeCommand(createPolicy);
        policyCommandsInvoker.takeCommand(updatePolicy);
        policyCommandsInvoker.takeCommand(cancelPolicy);

        policyCommandsInvoker.runCommands(UUID.randomUUID());
    }
}
