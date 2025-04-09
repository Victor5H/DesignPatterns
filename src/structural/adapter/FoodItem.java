package structural.adapter;

public class FoodItem implements Item {
    private String productName;
    private double price;
    private String restaurantName;

    @Override
    public String getProductName() {
        return this.productName;
    }

    public FoodItem() {
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getRestaurantName() {
        return this.restaurantName;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", restaurantName='" + restaurantName + '\'' +
                '}';
    }

    public FoodItem(String productName, double price, String restaurantName) {
        this.productName = productName;
        this.price = price;
        this.restaurantName = restaurantName;
    }
}
