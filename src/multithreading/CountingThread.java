package multithreading;

public class CountingThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i+1);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getCause());
            }
        }
    }
}
