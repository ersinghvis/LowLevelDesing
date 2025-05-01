package designpatterns.observer;

public class Subscriber implements ISubscriber{
    @Override
    public void notifyChanges(String videoName) {
        System.out.println("New video " + videoName + " uploaded");
    }
}
