package Behavioral.ObserverDesignPattern.Observable;

import Behavioral.ObserverDesignPattern.Observer.NotifcationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{

    List<NotifcationObserver> notifcationObserverList = new ArrayList<>();
    int stockCount =0;
    @Override
    public void add(NotifcationObserver observer) {
        notifcationObserverList.add(observer);
    }

    @Override
    public void remove(NotifcationObserver observer) {
        notifcationObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotifcationObserver observer: notifcationObserverList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
