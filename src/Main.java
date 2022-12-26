import Observable.IphoneObservable;
import Observable.StocksObservable;
import Observer.EmailNotificationObserver;
import Observer.MessageNotificationObserver;
import Observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        StocksObservable iphoneObservable = new IphoneObservable();

        NotificationObserver observer1 = new EmailNotificationObserver("abc@gmail.com", iphoneObservable);
        NotificationObserver observer2 = new MessageNotificationObserver("xyz", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);

        iphoneObservable.setStocks(100);

    }
}