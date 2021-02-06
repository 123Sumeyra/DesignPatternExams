package midterm.pattern1;


import java.text.DecimalFormat;
public class DecoratorPatternDemo {



    public static void main(String[] args) {
        DecimalFormat dformat = new DecimalFormat("#.##");
        IAutomobile automobile = new BaseSivic();
        IAutomobile automobile1 = new BaseSity();

        automobile = new MusicSystem(automobile);
        automobile = new AutamaticBreakingSystem(automobile);
        //automobile1 =new Airbag(automobile1);


        System.out.println("Definement: "+automobile.getDefinement());
        System.out.println("Price: "+dformat.format(automobile.getPrice()));
        System.out.println("Definement: " + automobile1.getDefinement());
        System.out.println("Price: " + dformat.format(automobile1.getPrice()));




    }
}
