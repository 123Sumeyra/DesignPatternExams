package resitexam.abstractfactory;



public class CheesePizza extends Pizza {



    public CheesePizza(String name, PizzaIngredientFactory pizzaingredientFactory) {
        super(name, pizzaingredientFactory.createDough(), pizzaingredientFactory.createSauce(), pizzaingredientFactory.createCheese());
    }


    @Override
    public void prepare() {

        System.out.println(name + "Pizza is being prepared");
    }
}
