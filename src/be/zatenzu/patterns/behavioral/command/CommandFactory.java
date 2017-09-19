package be.zatenzu.patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

//should be a singleton
public class CommandFactory {

    public static Map<Integer, Command> getCommandMap(){
        Map<Integer, Command> integerCommandMap = new HashMap<>();

        integerCommandMap.put(1, new LoginCommand());
        integerCommandMap.put(2, new LogoutCommand());
        integerCommandMap.put(3, new QueryCommand());

        return integerCommandMap;
    }

    public static Map<Integer, Runnable> getCommandMap2(){
        Map<Integer, Runnable> integerCommandMap = new HashMap<>();

        integerCommandMap.put(1, CommandFactory::doLogin);
        integerCommandMap.put(2, CommandFactory::doLogout);
        integerCommandMap.put(3, CommandFactory::doQuery);

        return integerCommandMap;
    }

    public static void doLogin(){}
    public static void doLogout(){}
    public static void doQuery(){}

}
