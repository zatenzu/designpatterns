package be.zatenzu.patterns.behavioral.observer.withjavaapi;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class MyObserverPanel extends JPanel implements Observer{

    private JLabel myLabel;

    public MyObserverPanel() {
        this.myLabel = new JLabel();
    }

    @Override
    public void update(Observable o, Object arg) {
        this.myLabel.setText((String)arg);
        this.repaint();
    }
}
