package midterm.pattern1;
public class MusicSystem extends AbstractAutoDecorator {


    private  IAutomobile automobile;

    MusicSystem(IAutomobile automobile) {


        this.automobile = automobile;


    }



    public String getDefinement() {
        return automobile.getDefinement()+" Music (1000)";
    }



    public double getPrice() {
        return automobile.getPrice()+1000;
    }



}