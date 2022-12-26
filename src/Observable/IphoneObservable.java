package Observable;

import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StocksObservable{
    List<NotificationObserver> observers = new ArrayList<>();
    public static int stockCount = 0;
    @Override
    public void add(NotificationObserver notificationObserver) {
        observers.add(notificationObserver);
    }

    @Override
    public void notifyObservers() {
       for(NotificationObserver observer : observers){
           observer.update();
       }
    }

    @Override
    public void setStocks(int stocksCount) {
        if (stockCount == 0){
            notifyObservers();
        }
        stockCount = stockCount + stocksCount;

    }
}
