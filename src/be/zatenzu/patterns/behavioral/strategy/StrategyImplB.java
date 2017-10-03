package be.zatenzu.patterns.behavioral.strategy;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Strategy implementation to apply algorithm B
 */
@Component
public class StrategyImplB implements Strategy {

    @Override
    public void execute(byte[] data) {
        System.out.println("Apply strategy B on:" + Arrays.toString(data));
    }
}
