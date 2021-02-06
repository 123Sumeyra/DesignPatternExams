package midterm.pattern1;

public class Airbag  extends AbstractAutoDecorator {

    private  IAutomobile automobile;
    Airbag(IAutomobile automobile) {


        this.automobile = automobile;


    }



    public String getDefinement() {
        return automobile.getDefinement()+" Airbag (3000)";
    }



    public double getPrice() {
        return automobile.getPrice()+3000;
    }



}

