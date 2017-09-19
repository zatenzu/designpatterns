package be.zatenzu.patterns.behavioral.interpreter;

public class RimExpressionAddOperator implements RimExpression{

    private RimExpression value1;
    private RimExpression value2;

    public RimExpressionAddOperator(RimExpression exp1, RimExpression exp2) {
        this.value1 = exp1;
        this.value2 = exp2;
    }

    @Override
    public RimExpressionValue evaluate() {
        return new RimExpressionValue(value1.evaluate().getValue() + value2.evaluate().getValue());
    }
}
