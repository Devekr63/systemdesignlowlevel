package org.example.observer;

import org.example.observable.IPhone;
import org.example.observable.ProductObservable;

public class EmailNotification implements NotificationObserver{

    ProductObservable product;

    public EmailNotification(ProductObservable product){
        this.product = product;
    }
    @Override
    public void update() {
        System.out.println("Notification for : "+product.getItemName());
    }
}
