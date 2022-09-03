package main.observerPattern;

public class ObserverPatternMain {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();
        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);
        publisher.notifySubscribers("Iphone 14 is launched");
        IphoneMadFan iphoneMadFan = new IphoneMadFan();
        try {
            publisher.removeSubscriber(subscriber2);
        } catch (ObserverNotFoundException e) {
            e.getStackTrace();
        }
        Subscriber3 subscriber3 = new Subscriber3();
        publisher.addSubscriber(subscriber3);
        publisher.notifySubscribers("Iphone 14 mini is launched");
        try {
            publisher.removeSubscriber(iphoneMadFan);
        } catch (ObserverNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
