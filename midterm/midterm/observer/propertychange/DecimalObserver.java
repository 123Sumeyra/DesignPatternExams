package midterm.observer.propertychange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class DecimalObserver implements PropertyChangeListener {


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Info wInfo = (Info) evt.getNewValue();
        System.out.println( "Decimal: " + ( wInfo.getState() ) );


    }


}




