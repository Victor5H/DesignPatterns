package multithreading;

public class Main {
    public static void main(String[] args) {
        CountingThread ct = new CountingThread();
        System.out.println("start");
        for (int i = 0; i < 10000000; i++) {
            new CountingThread().start();
        }
//        ct.run();
//        ct.start();
//        System.get
//        Runtime.getRuntime().gc();
        System.out.println("end");
    }
}
