package midterm.observer.javautil;

import java.util.Observable;
import java.util.Observer;

public  class HexaObserver implements Observer {
    private Subject subject;

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.append(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println( "Hex: " + Integer.toHexString( subject.getState() ) );

    }
}