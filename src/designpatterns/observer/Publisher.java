package designpatterns.observer;

public interface Publisher {

    public void subscribe(ISubscriber subscriber);

    public void unsubscribe(ISubscriber subscriber);

    public void uploadVideo(String name);

}
