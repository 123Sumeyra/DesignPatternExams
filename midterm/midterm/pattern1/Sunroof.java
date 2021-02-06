package midterm.pattern1;


public class Sunroof extends AbstractAutoDecorator {

    private  IAutomobile automobile;
    Sunroof(IAutomobile automobile) {


        this.automobile = automobile;


    }



    public String getDefinement() {
        return automobile.getDefinement()+" Sunroof (2000)";
    }



    public double getPrice() {
        return automobile.getPrice()+2000;
    }




}



