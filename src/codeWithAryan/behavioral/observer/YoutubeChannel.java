package codeWithAryan.behavioral.observer;

public interface YoutubeChannel {
    public void notifySubscribers();
    public void addSubscriber(Subscriber s) ;
    public void removeSubscriber(Subscriber s);

    String getLatestVideo();
}
