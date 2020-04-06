package com.sergiomartinrubio.javadesignpatterns.behavioural.observer;

import com.sergiomartinrubio.javadesignpatterns.behavioural.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageNotifier implements Subject, Runnable {

    private List<Observer> observers;

    private String message;

    public MessageNotifier() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String showMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        Scanner sc =  new Scanner(System.in);
        while (true) {
            String response = sc.next();
            setMessage(response);
            notifyObservers();
        }

    }
}
