package solid.openClosed;

public class AddOperation implements Operation{
    @Override
    public int perform(int a, int b) {
        return a+b;
    }
}
