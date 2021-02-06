package midterm.observer.propertychange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class BinaryObserver implements PropertyChangeListener
{


    public void propertyChange(PropertyChangeEvent evt) {
        Info wInfo = (Info) evt.getNewValue();

        System.out.println( "Binary: " + Integer.toBinaryString( wInfo.getState() ) );


    }



}