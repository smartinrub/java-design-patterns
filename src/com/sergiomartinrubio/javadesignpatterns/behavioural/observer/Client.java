package com.sergiomartinrubio.javadesignpatterns.behavioural.observer;

import com.sergiomartinrubio.javadesignpatterns.behavioural.observer.observers.Desktop;
import com.sergiomartinrubio.javadesignpatterns.behavioural.observer.observers.Mobile;
import com.sergiomartinrubio.javadesignpatterns.behavioural.observer.observers.Tablet;

public class Client {

    public static void main(String[] args) {

        System.out.println("Enter message: ");
        MessageNotifier messageNotifier =  new MessageNotifier();
        Mobile observerOne = new Mobile(messageNotifier);
        Desktop observerTwo = new Desktop(messageNotifier);
        Tablet observerThree = new Tablet(messageNotifier);
        messageNotifier.register(observerOne);
        messageNotifier.register(observerTwo);
        messageNotifier.register(observerThree);

        new Thread(messageNotifier).start();
    }
}
