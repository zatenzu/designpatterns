package be.zatenzu.patterns.behavioral.strategy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        //get Spring application context
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/be/zatenzu/patterns/behavioral/strategy/application-context.xml");
        //get StrategyContext bean from Spring context
        StrategyContext sc = classPathXmlApplicationContext.getBean(StrategyContext.class);
        //get data
        byte[] data = new byte[]{1};
        //apply algorithms to data
        sc.applyStrategies(data);
    }
}