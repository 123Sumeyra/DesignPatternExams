package midterm.observer.javautil;

import java.util.Observable;
import java.util.Observer;

public class DecimalObserver implements Observer{
    private Subject subject;

    public DecimalObserver(Subject subject){
        this.subject = subject;
        this.subject.append(this);
    }



    @Override
    public void update(Observable o, Object arg) {
        System.out.println( "Decimal: " + ( subject.getState() ) );

    }
}




