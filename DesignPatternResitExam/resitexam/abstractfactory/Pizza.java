package resitexam.abstractfactory;


public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

    public Pizza(String name, Dough dough, Sauce sauce, Cheese cheese) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    public abstract void prepare();

    public void bake(){
        System.out.println("Pizza is being baked");
    }

    public void cut(){
        System.out.println("Pizza is being cut");
    }

    public void box(){
        System.out.println("Pizza is being boxed");
    }


//    @Override
//    public String toString() {
//        return "Pizza{" +
//                "name='" + name + '\'' +
//                ", dough='" + dough + '\'' +
//                ", sauce='" + sauce + '\'' +
//
//                '}';
//    }


    public String getName() {
        return name;
    }
}
