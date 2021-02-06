package midterm.observer.myclasses;

public class HexaDecimalObserver implements IObserver{
   ISubject subject;

    public HexaDecimalObserver(ISubject subject){
        this.subject = subject;
        this.subject.append(this);

    }


    @Override
    public void update() {
        System.out.println( "Hex: " + Integer.toHexString( subject.getState() ));

    }
}
