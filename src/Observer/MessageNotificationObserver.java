package Observer;

import Observable.StocksObservable;

public class MessageNotificationObserver implements NotificationObserver{
    String name;
    StocksObservable stocksObservable;

    public MessageNotificationObserver(String name, StocksObservable stocksObservable) {
        this.name = name;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("Sending message to " + name);
    }
}
