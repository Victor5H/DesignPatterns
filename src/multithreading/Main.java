package multithreading;

public class Main {
    public static void main(String[] args) {
        CountingThread ct = new CountingThread();
        System.out.println("start");
        Thread thread = new Thread(new Run());
//        thread.start();
        for (int i = 0; i < 10000000; i++) {
            Thread c = new CountingThread();
            c.setDaemon(true);
                    c.start();
        }
//        ct.run();
//        ct.start();
        Runtime.getRuntime().gc();
        System.out.println("end");

    }
}
