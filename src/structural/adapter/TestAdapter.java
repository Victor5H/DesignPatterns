package structural.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        SwiggyStore s = new SwiggyStore();
        s.addItem(new FoodItem("Chilli Chicken",90.0,"tadka house"));
        s.addItem(new FoodItem("Munchow soup",78.8,"Ambrosios"));
        s.addItem(new GroceryAdapter(new GroceryProduct("Rin",66.8,"kirana")));
        s.getItems().stream().forEach(System.out::println);
    }
}
