package be.zatenzu.patterns.behavioral.observer.withoutjavaapi;

public class Client {

    public static void main(String[] args) {
        MyPanelA myPanelA = new MyPanelA();
        MyPanelB myPanelB = new MyPanelB();
        myPanelA.addActionAListener(myPanelB);
    }

}
