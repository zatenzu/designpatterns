package be.zatenzu.patterns.behavioral.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Context
 */
@Component
public class StrategyContext {

    //encapsulates strategies
    @Autowired
    private List<Strategy> strategies;

    //apply strategies
    public void applyStrategies(final byte[] data){
        this.strategies.stream().forEach(strategy -> strategy.execute(data));
    }

}
