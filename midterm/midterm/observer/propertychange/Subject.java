package midterm.observer.propertychange;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Subject {

    PropertyChangeSupport support;
    Info info = new Info();
    public Subject(){
        support = new PropertyChangeSupport(this);
    }

    public void addObserver(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);


    }


    public int getState() {
        return info.getState();
    }

    public void setState(int bi) {
        info.setState(bi);
        support.firePropertyChange("news",null,info);





    }





}
