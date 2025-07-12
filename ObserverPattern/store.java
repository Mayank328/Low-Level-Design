package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class store {
    public static void main(String args[]){

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver obv1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver obv2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver obv3 = new MobileAlertObserverImpl("xyz_username", iphoneStockObservable);

        iphoneStockObservable.add(obv1);
        iphoneStockObservable.add(obv2);
        iphoneStockObservable.add(obv3);

        iphoneStockObservable.setStockCount(10);
    }
}