package be.zatenzu.patterns.behavioral.observer.withoutjavaapi;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MyPanelA extends JPanel{

    List<ActionAListener> actionAListeners = new ArrayList<>();

    public void addActionAListener(ActionAListener listener){
        this.actionAListeners.add(listener);
    }

    public void actionA(){
        //...

    }

    private void notifyActionAListeners(){
        for (ActionAListener actionAListener : this.actionAListeners) {
            actionAListener.notifyMe();
        }
    }

}
