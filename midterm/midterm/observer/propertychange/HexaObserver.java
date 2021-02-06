package midterm.observer.propertychange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public  class HexaObserver implements PropertyChangeListener {


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Info wInfo = (Info) evt.getNewValue();


        System.out.println( "Hex: " + Integer.toHexString( wInfo.getState() ) );


    }
}