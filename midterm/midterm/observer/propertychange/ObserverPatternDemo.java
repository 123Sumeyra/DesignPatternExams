package midterm.observer.propertychange;

public class ObserverPatternDemo {
    public static void main(String[] args) throws InterruptedException {
        Subject subject = new Subject();


        subject.addObserver(new BinaryObserver());
        subject.addObserver(new DecimalObserver());
        subject.addObserver(new HexaObserver());



        int publishCount = 5;

        for (int i =0; i<publishCount; i++){
            int number = i*20;
            System.out.println("\nPublishing:" + number);


            subject.setState(number);
            Thread.sleep(1000);
        }
    }
}