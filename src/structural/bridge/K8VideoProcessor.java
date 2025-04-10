package structural.bridge;

public class K8VideoProcessor implements VideoProcessor{
    @Override
    public void process(String file) {
        System.out.println("Processing "+file+" in 8K");
    }
    @Override
    public String toString() {
        return "8K processor";
    }
}
