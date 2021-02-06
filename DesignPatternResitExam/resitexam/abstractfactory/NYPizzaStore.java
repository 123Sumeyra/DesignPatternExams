package resitexam.abstractfactory;


public class NYPizzaStore extends PizzaStore {
    PizzaIngredientFactory pizzaingredientFactory = new NYPizzaIngredientFactory();

    public void scheduleDelivery() {
        System.out.println("delivery is schedule");
    }


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza("NY Style Cheese", pizzaingredientFactory);
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza("NY Style Pepperoni", pizzaingredientFactory);
        } else if (type.equals("veggi")) {
            pizza = new VeggiePizza("NY Style Veggie", pizzaingredientFactory);
        } else {
            return null;
        }
        return pizza;
    }
}
