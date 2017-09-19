package be.zatenzu.patterns.behavioral.interpreter;

public class RimExpressionValue implements RimExpression{

    private Long value;

    public RimExpressionValue(Long value) {
        this.value = value;
    }

    @Override
    public RimExpressionValue evaluate() {
        return this;
    }

    public Long getValue() {
        return value;
    }
}
