package midterm.observer.javautil;

public class ObserverPatternDemo {
    public static void main(String[] args) throws InterruptedException {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new DecimalObserver(subject);
        new BinaryObserver(subject);



        int publishCount = 5;

        for (int i =0; i<publishCount; i++){
            int number = i*20;
            System.out.println("\nPublishing:" + number);
            subject.setState(number);
            Thread.sleep(1000);
        }
    }
}