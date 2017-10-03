package be.zatenzu.patterns.behavioral.strategy;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Strategy implementation to apply algorithm C
 */
@Component
@Conditional(MyCondition.class)
public class StrategyImplC implements Strategy {

    @Override
    public void execute(byte[] data) {
        System.out.println("Apply strategy C on:" + Arrays.toString(data));
    }
}
