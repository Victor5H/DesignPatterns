package structural.adapter;

public class GroceryAdapter implements Item{
    private GroceryItem item;

    public GroceryAdapter(GroceryItem item){
        this.item=item;
    }

    @Override
    public String toString() {
        return "GroceryAdapter{" +
                "item=" + item +
                '}';
    }

    @Override
    public String getRestaurantName() {
        return item.getStoreName();
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getProductName() {
        return item.getProductName();
    }
}
