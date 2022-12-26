package Observable;

import Observer.NotificationObserver;

public interface StocksObservable {

    void add(NotificationObserver notificationObserver);

    void notifyObservers();

    void setStocks(int stocksCount);

}
