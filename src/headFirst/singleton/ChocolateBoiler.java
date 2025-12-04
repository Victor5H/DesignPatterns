package headFirst.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;
    private ChocolateBoiler(){
        empty = true;
        boiled = false;

    }
    public static ChocolateBoiler getInstance(){
        if(uniqueInstance==null) {
            synchronized (ChocolateBoiler.class) {
                if(uniqueInstance==null) uniqueInstance = new ChocolateBoiler();
                return uniqueInstance;
            }
        }
        return uniqueInstance;
    }
    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
    public void drain(){
        empty = true;
        boiled = false;
    }

}
