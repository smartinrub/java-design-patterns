package com.sergiomartinrubio.javadesignpatterns.behavioural.observer.observers;

import com.sergiomartinrubio.javadesignpatterns.behavioural.observer.MessageNotifier;

public class Tablet implements Observer {

    private MessageNotifier messageNotifier;

    public Tablet(MessageNotifier messageNotifier) {
        this.messageNotifier = messageNotifier;
    }

    @Override
    public void update() {
        System.out.println(messageNotifier.showMessage() + " from Desktop");
    }
}
