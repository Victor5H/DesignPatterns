package structural.adapter;

public class GroceryProduct implements GroceryItem{
    private String productName;
    private double price;
    private String storeName;

    public GroceryProduct(String productName, double price, String storeName) {
        this.productName = productName;
        this.price = price;
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return "GroceryProduct{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", storeName='" + storeName + '\'' +
                '}';
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getStoreName() {
        return this.storeName;
    }
}
