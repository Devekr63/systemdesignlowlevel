package org.example.observable;

import org.example.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhone implements ProductObservable{

    private List<NotificationObserver> observers;

    private int quantity;

    private String name;

    public IPhone(List<NotificationObserver> observers, int quantity){
        name = "I Phone 14 Pro.";
        this.observers = observers;
        this.quantity = quantity;
        notifyObserver();
    }
    @Override
    public void addObserver(NotificationObserver notificationObserver) {
        if(!observers.contains(notificationObserver)){
            observers.add(notificationObserver);
        }
    }

    @Override
    public void removeObserver(NotificationObserver notificationObserver) {
        observers.removeIf(observer -> observer == notificationObserver);
    }

    @Override
    public void notifyObserver() {
        if (quantity > 0){
            observers.forEach(NotificationObserver::update);
        }
    }

    @Override
    public String getItemName(){
        return name;
    }


    public void setObservers(List<NotificationObserver> observers) {
        this.observers = observers;
        notifyObserver();
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObserver();
    }

}
