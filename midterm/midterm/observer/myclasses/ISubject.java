package midterm.observer.myclasses;

interface ISubject{


    public void append(IObserver observer);
    public int getState();
    public void setState(int state);
    public void notifyAllObservers();

}
