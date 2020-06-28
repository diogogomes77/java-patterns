package dev.dgomes.observer;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject{

    private String name;
    private String message;
    private List<Observer> observers;

    public EmailTopic(String name){
        this.name = name;
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obs) {
        if(!observers.contains(obs))
            this.observers.add(obs);
    }

    @Override
    public void unregister(Observer obs) {
        this.observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    @Override
    public Object getUpdate(Observer obs) {
        return this.message;
    }

    public void postMessage(String msg){
        this.message = msg;
        System.out.println("Message posted to " + name + ": " + msg);
        this.message = msg;
        notifyObservers();
    }
}
