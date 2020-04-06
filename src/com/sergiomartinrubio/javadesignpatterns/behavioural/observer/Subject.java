package com.sergiomartinrubio.javadesignpatterns.behavioural.observer;


import com.sergiomartinrubio.javadesignpatterns.behavioural.observer.observers.Observer;

public interface Subject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}
