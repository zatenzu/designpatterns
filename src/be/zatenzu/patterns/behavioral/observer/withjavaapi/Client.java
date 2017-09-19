package be.zatenzu.patterns.behavioral.observer.withjavaapi;

public class Client {

    public static void main(String[] args) {
        MyObserverPanel myObserverPanel = new MyObserverPanel();
        MyObservableObject myObservableObject = new MyObservableObject("data");
        myObservableObject.addObserver(myObserverPanel);
    }

}
