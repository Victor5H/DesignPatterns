package solid.openClosed;

public class BadCalculator {
    public int calculate(int a, int b, String operation){
        switch (operation){
            case "add": return a+b;
            case "sub": return a-b;
            default: return 0;
        }
    }
}

//for any other operations like mul and div, we need to modify this file, which violates the principle

