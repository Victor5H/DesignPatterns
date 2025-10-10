package codeWithAryan.behavioral.observer;

public class EmailNotification implements Subscriber,Runnable{
    YoutubeChannel channel;
    EmailNotification(YoutubeChannel channel){
        this.channel =  channel;
    }
    @Override
    public void update() {
        synchronized (this) {
            notify();
        }
        System.out.println("Received email notif for video "+channel.getLatestVideo());
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
