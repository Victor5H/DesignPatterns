package creational.factory;

public class PizzaFactory {
    private PizzaFactory(){}
    public static Pizza getPizza(String type){
        Pizza p = switch (type) {
            case "Chicken" -> new ChickenPizza();
            case "Veg" -> new VegPizza();
            case "Cheese" -> new CheesePizza();
            default -> null;
        };
        return p;
    }
}
