package org.example.observable;

import org.example.observer.NotificationObserver;

public interface ProductObservable {
    void addObserver(NotificationObserver notificationObserver);
    void removeObserver(NotificationObserver notificationObserver);
    void notifyObserver();

    default String doSomeThing(){
        return "";
    }

    private void doNothing(){
        System.out.println("I am doing nothing.");
    }

    String getItemName();

}
