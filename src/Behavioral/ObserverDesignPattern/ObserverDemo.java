package Behavioral.ObserverDesignPattern;

import Behavioral.ObserverDesignPattern.Observable.IphoneStockObservable;
import Behavioral.ObserverDesignPattern.Observable.StockObservable;
import Behavioral.ObserverDesignPattern.Observer.EmailNotificationObserver;
import Behavioral.ObserverDesignPattern.Observer.SMSNotificationObserver;

/**
 * Observer Design Pattern - Observer is a behavioral design pattern that lets you define a subscription mechanism to
 * notify multiple objects about any events that happen to the object they’re observing.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneStockObservable();
        EmailNotificationObserver emailNotificationObserver = new EmailNotificationObserver("thilak@gmail.com", stockObservable);
        SMSNotificationObserver smsNotificationObserver = new SMSNotificationObserver("1234567890", stockObservable);

        stockObservable.add(emailNotificationObserver);
        stockObservable.add(smsNotificationObserver);

        stockObservable.setStockCount(10);
        System.out.println(stockObservable.getStockCount());
        stockObservable.setStockCount(200);
        System.out.println(stockObservable.getStockCount());
        stockObservable.setStockCount(-210);
        System.out.println(stockObservable.getStockCount());
        stockObservable.setStockCount(15);
        System.out.println(stockObservable.getStockCount());

    }
}
