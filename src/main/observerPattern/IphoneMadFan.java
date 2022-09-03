package main.observerPattern;

public class IphoneMadFan implements Observer {
    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
