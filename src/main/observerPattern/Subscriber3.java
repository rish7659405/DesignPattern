package main.observerPattern;

public class Subscriber3 implements Observer{
    Observer observer;
    @Override
    public void update(String message) {
        System.out.println("Subscriber 3 hurry up,"+message);
    }
}
