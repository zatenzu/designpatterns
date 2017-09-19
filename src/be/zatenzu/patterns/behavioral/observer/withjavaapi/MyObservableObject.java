package be.zatenzu.patterns.behavioral.observer.withjavaapi;

import java.util.Observable;

public class MyObservableObject extends Observable {

    private String data;

    public MyObservableObject(String data) {
        this.data = data;
    }

    public void action(){
        this.data += " Done";
        notifyObservers(this.data);
        //or notifyObservers();
    }
}
