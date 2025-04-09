package solid.openClosed;

public class GoodCalculator {
     public static int calculate(int a, int b, Operation operation){
         return operation.perform(a,b);
     }
}
