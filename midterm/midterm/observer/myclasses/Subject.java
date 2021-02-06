package midterm.observer.myclasses;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{
    private List<IObserver> observers = new ArrayList<IObserver>();
    private int state;


    @Override
    public void append(IObserver observer) {
        observers.add(observer);

    }

    @Override
    public int getState() {
        return state;

    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();

    }

    @Override
    public void notifyAllObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }

    }
}
