package solid.openClosed;

public class Main {
    public static void main(String[] args) {
        int res =GoodCalculator.calculate(4,5, new AddOperation());
        res = GoodCalculator.calculate(5,6,new SubOperation());
        System.out.println(res);
    }
}
