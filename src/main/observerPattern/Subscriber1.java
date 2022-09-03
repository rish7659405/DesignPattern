package main.observerPattern;

public class Subscriber1 implements Observer {


    @Override
    public void update(String message) {
        System.out.println("Subscriber1 hurry up," + message);
    }
}
