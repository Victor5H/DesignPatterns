package multithreading;

import creational.singleton.MultithreadedSingleton;

public class SingletonBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                System.out.println(MultithreadedSingleton.getInstance());
            }).start();
        }
        for (int i = 0; i < 10000; i++) {
            new Thread(() ->{
                System.out.println(MultithreadedSingleton.getInstance());
            }).start();
        }
    }
}
