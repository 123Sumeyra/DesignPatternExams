package midterm.observer.myclasses;

public class DecimalObserver implements  IObserver {
    ISubject subject;

    public DecimalObserver(ISubject subject){
        this.subject = subject;
        this.subject.append(this);

    }



    @Override
    public void update() {
        System.out.println( "Decimal: " + ( subject.getState() ) );


    }
}

