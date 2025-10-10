package codeWithAryan.behavioral.observer;

public class PhoneNotification implements Subscriber, Runnable {
    YoutubeChannel channel;

    PhoneNotification(YoutubeChannel channel) {
        this.channel = channel;
    }

    @Override
    public void update() {
        synchronized (this) {
            notify();
        }
        System.out.println("Received phone notif for video " + channel.getLatestVideo());
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                while (true) {
                    wait();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
