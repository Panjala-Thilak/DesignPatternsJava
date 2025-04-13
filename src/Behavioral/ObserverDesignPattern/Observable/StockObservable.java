package Behavioral.ObserverDesignPattern.Observable;

import Behavioral.ObserverDesignPattern.Observer.NotifcationObserver;

public interface StockObservable {
    public void add(NotifcationObserver observer);
    public void remove(NotifcationObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
