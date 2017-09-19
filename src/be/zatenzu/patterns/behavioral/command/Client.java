package be.zatenzu.patterns.behavioral.command;

import java.util.Map;
import java.util.function.Consumer;

public class Client {

    enum Action{LOGIN, LOGOUT, QUERY}

    public static void main(String[] args) {
        Action action = getAction(Integer.valueOf(args[0]));

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

        Map<Integer, Command> commandMap = CommandFactory.getCommandMap();
        Command command = commandMap.get(getAction(Integer.valueOf(args[0])));
        command.execute();

        //======== Java8
        Map<Integer, Runnable> commandMap2 = CommandFactory.getCommandMap2();
        Runnable c = commandMap2.get(getAction(Integer.valueOf(args[0])));
        c.run();
    }

    public static Action getAction(int actionValue){
        return Action.LOGIN;
    }

    public static void doLogin(){}
    public static void doLogout(){}
    public static void doQuery(){}

}
