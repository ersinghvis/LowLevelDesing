package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Publisher{

    private List<ISubscriber> subscribers;

    public YoutubeChannel(){
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void unsubscribe(ISubscriber subscriber){
        subscribers.remove(subscriber);
    }


    @Override
    public void subscribe(ISubscriber subscriber) {
        subscribers.add( subscriber );
    }

    @Override
    public void uploadVideo(String name){
        subscribers.forEach( subscriber -> subscriber.notifyChanges(name) );
    }

}
