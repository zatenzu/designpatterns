package be.zatenzu.patterns.behavioral.interpreter;

public class Client {

    public static RimExpression parseRimExpression(String expression){
        //5 + function1()
        RimExpressionValue rimExpressionValue = new RimExpressionValue(5L);
        RimExpressionFunction rimExpressionFunction = new RimExpressionFunction("function1");
        return new RimExpressionAddOperator(rimExpressionValue, rimExpressionFunction);
    }

    public static void main(String[] args) {
        RimExpression exp = parseRimExpression(args[0]);
        System.out.println("result =" + exp.evaluate().getValue());
    }

}
