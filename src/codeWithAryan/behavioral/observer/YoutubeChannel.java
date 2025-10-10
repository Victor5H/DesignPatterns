package codeWithAryan.behavioral.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class YoutubeChannel {
    List<Subscriber> subscribers;
    LinkedList<String> videos;
    YoutubeChannel(){
        subscribers = new ArrayList<>();
        videos = new LinkedList<>();
        videos.add("sdfdsf");
        videos.add("234fed");
    }
    public void postNewVideo(String url){
        videos.add(url);
        notifySubscribers();
    }
    public void notifySubscribers(){
        for(Subscriber s:subscribers)
            s.update();
    }
    public void addSubscriber(Subscriber s) {subscribers.add(s);}
    public void removeSubscriber(Subscriber s){subscribers.remove(s);}

    public String getLatestVideo() {
        return videos.peekLast();
    }
}
