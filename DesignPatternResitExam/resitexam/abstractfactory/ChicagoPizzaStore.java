package resitexam.abstractfactory;


public class ChicagoPizzaStore extends PizzaStore{


    PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

    public void scheduleDelivery(){
        System.out.println("delivery is schedule");
    }


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza("Chicago Style Cheese", pizzaIngredientFactory);
        }else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza("Chicago Style Pepperoni", pizzaIngredientFactory);
        }else if (type.equals("veggi")) {
            pizza = new VeggiePizza("Chicago Style Veggie", pizzaIngredientFactory);
        }else{
            return null;
        }
        return pizza;
    }
}
