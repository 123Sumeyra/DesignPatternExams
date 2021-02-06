package midterm.pattern1;

public class AutamaticBreakingSystem extends AbstractAutoDecorator {
    private  IAutomobile automobile;

    AutamaticBreakingSystem(IAutomobile automobile) {

        this.automobile = automobile;

    }



    public String getDefinement() {
        return automobile.getDefinement()+" ABS (5000)";
    }



    public double getPrice() {
        return automobile.getPrice()+5000;
    }





}
