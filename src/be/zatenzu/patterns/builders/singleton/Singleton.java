package be.zatenzu.patterns.builders.singleton;

import java.util.Properties;

public final class Singleton {

    private static volatile Singleton instance;
    private Properties config;

    private Singleton(){
        this.config = readConfigFile();
    }

    public static final Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private Properties readConfigFile() {
        return new Properties();
    }

    public Properties getConfig() {
        return config;
    }
}
