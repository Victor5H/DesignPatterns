package creational.factory;

public class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza p = PizzaFactory.getPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        return p;
    }
}
