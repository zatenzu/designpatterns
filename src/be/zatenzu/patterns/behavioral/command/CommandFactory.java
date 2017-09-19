package be.zatenzu.patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

//should be a singleton
public class CommandFactory {

    public static Map<Client.Action, Command> getCommandMap(){
        Map<Client.Action, Command> integerCommandMap = new HashMap<>();

        integerCommandMap.put(Client.Action.LOGIN, new LoginCommand());
        integerCommandMap.put(Client.Action.LOGOUT, new LogoutCommand());
        integerCommandMap.put(Client.Action.QUERY, new QueryCommand());

        return integerCommandMap;
    }

    public static Map<Client.Action, Runnable> getCommandMap2(){
        Map<Client.Action, Runnable> integerCommandMap = new HashMap<>();

        integerCommandMap.put(Client.Action.LOGIN, LoginCommand::new);
        integerCommandMap.put(Client.Action.LOGOUT, new LogoutCommand()::execute);
        integerCommandMap.put(Client.Action.QUERY, QueryCommand::new);

        return integerCommandMap;
    }

}
