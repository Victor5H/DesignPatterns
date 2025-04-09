package creational.abstractFactory.button;

public class WindowsButton implements Button{
    @Override
    public void build() {
        System.out.println("Windows button built");
    }
}
