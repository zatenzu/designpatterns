package be.zatenzu.patterns.builders.singleton;

import java.util.Properties;

public class Client {

    public static void main(String[] args) {
        Properties config = Singleton.getInstance().getConfig();
    }

}
