package be.zatenzu.patterns.behavioral.command;

import java.util.Map;
import java.util.function.Consumer;

public class Client {

    enum Action{LOGIN, LOGOUT, QUERY}

    public static void main(String[] args) {
        Action action = getAction(1);

        switch(action) {
            case LOGIN:
                doLogin();
                break;
            case LOGOUT:
                doLogout();
                break;
            case QUERY:
                doQuery();
                break;
        }
        //======== replaced by

        Map<Action, Command> commandMap = CommandFactory.getCommandMap();
        Command command = commandMap.get(getAction(1));
        command.execute();

        //======== Java8
        Map<Action, Runnable> commandMap2 = CommandFactory.getCommandMap2();
        Runnable c = commandMap2.get(getAction(1));
        c.run();
    }

    public static Action getAction(int actionValue){
        return Action.LOGIN;
    }

    public static void doLogin(){}
    public static void doLogout(){}
    public static void doQuery(){}

}
