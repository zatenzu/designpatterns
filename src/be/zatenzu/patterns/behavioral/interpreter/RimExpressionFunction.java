package be.zatenzu.patterns.behavioral.interpreter;

public class RimExpressionFunction implements RimExpression {

    private String vbFunctionName;

    public RimExpressionFunction(String vbFunctionName) {
        this.vbFunctionName = vbFunctionName;
    }

    @Override
    public RimExpressionValue evaluate() {
        return new RimExpressionValue(callFunction(vbFunctionName));
    }

    private long callFunction(String vbFunctionName) {
        return 0;
    }
}
