package main.observerPattern;

public class Subscriber2 implements Observer{

    @Override
    public void update(String message) {
        System.out.println("Subscriber2 hurry up,"+message);
    }
}
