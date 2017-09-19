package be.zatenzu.patterns.behavioral.observer.withoutjavaapi;

import javax.swing.*;

public class MyPanelB extends JPanel implements ActionAListener{

    @Override
    public void notifyMe() {
        //do stuff
    }
}
