package structural.bridge;

public class K4VideoProcessor implements VideoProcessor{
    @Override
    public void process(String file) {
        System.out.println("processing file "+file+" in 4K");
    }

    @Override
    public String toString() {
        return "4K processor";
    }
}
