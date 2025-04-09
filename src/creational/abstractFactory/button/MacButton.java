package creational.abstractFactory.button;

public class MacButton implements Button{
    @Override
    public void build() {
        System.out.println("Mac Button built");
    }
}
