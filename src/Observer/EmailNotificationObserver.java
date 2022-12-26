package Observer;

import Observable.StocksObservable;

public class EmailNotificationObserver implements NotificationObserver{
    String emailId;
    StocksObservable stocksObservable;

    public EmailNotificationObserver(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("Sending mail to " + emailId);
    }
}
