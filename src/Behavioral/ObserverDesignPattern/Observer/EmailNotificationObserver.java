package Behavioral.ObserverDesignPattern.Observer;


import Behavioral.ObserverDesignPattern.Observable.StockObservable;

public class EmailNotificationObserver implements NotifcationObserver{

    String emailId;
    StockObservable stockObservable;

    public EmailNotificationObserver(String emailId, StockObservable stockObservable){
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Email Notification sent");
    }
}
