package creational.singleton;

public class MultithreadedSingleton {
    private static volatile MultithreadedSingleton singleton = null;
    private static int num;
    private MultithreadedSingleton(){
        num=5;
        System.out.println("constructor called");
    }

    public static MultithreadedSingleton getInstance(){
        //first time to check if obj is not init
        if(singleton==null){
            synchronized (MultithreadedSingleton.class) {
                if (singleton == null) {
                    //all init here or int constructor
                    singleton = new MultithreadedSingleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(MultithreadedSingleton.getInstance().num);
    }
}
