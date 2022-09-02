package main.observerPattern;

import java.util.ArrayList;

public class Publisher implements Subject{
   private ArrayList<Observer>observers=new ArrayList<>();
    @Override
    public void addSubscriber(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeSubscriber(Observer o)throws ObserverNotFoundException {

          if (observers.contains(o))
          { observers.remove(o);}

      else{
          throw new ObserverNotFoundException("Subscriber is not found");
        }
    }

    @Override
    public void notifySubscribers(String msg) {
        for(Observer o:observers)
        {
            o.update(msg);
        }
    }
}
