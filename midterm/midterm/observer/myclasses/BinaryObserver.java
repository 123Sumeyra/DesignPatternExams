package midterm.observer.myclasses;

public class BinaryObserver implements  IObserver {
    ISubject subject;

    public BinaryObserver(ISubject subject){
        this.subject = subject;
        this.subject.append(this);

    }


    @Override
    public void update() {
        System.out.println( "Binary: " + Integer.toBinaryString( subject.getState() ) );


    }
}
