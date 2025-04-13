package Behavioral.ObserverDesignPattern.Observer;

import Behavioral.ObserverDesignPattern.Observable.StockObservable;

public class SMSNotificationObserver implements NotifcationObserver{

    String phoneNumber;
    StockObservable stockObservable;

    public SMSNotificationObserver(String phoneNumber, StockObservable stockObservable){
        this.phoneNumber = phoneNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("SMS Notification sent");
    }
}
