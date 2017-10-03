package be.zatenzu.patterns.behavioral.strategy;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Strategy implementation to apply algorithm A
 */
@Component
public class StrategyImplA implements Strategy{

    @Override
    public void execute(byte[] data) {
        System.out.println("Apply strategy A on:" + Arrays.toString(data));
    }
}
