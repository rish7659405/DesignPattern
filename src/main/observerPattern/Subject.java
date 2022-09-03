package main.observerPattern;

import java.util.*;

public interface Subject {
    public void addSubscriber(Observer o);

    public void removeSubscriber(Observer o) throws ObserverNotFoundException;

    public void notifySubscribers(String msg);

}
