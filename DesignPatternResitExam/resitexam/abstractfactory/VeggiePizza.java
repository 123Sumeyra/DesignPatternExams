package resitexam.abstractfactory;

public class VeggiePizza extends Pizza {


    public VeggiePizza(String name, PizzaIngredientFactory pizzaingredientFactory) {
        super(name, pizzaingredientFactory.createDough(), pizzaingredientFactory.createSauce(), pizzaingredientFactory.createCheese());
    }


    @Override
    public void prepare() {
        System.out.println(name + "Pizza is being prepared");
    }
}
