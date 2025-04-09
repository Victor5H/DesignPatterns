package solid.openClosed;

public class SubOperation implements Operation{
    @Override
    public int perform(int a, int b) {
        return a-b;
    }
}
