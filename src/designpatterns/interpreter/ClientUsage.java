package designpatterns.interpreter;

public class ClientUsage {
    public static void main(String[] args) {
        IExpression<Integer>expression1=new NumberExpression(10);
        IExpression<Integer>expression2=new NumberExpression(20);
        IExpression<Integer>add=new AddExpression(expression1,expression2);
        IExpression<Integer>add2=new AddExpression(add,new NumberExpression(40));
        int result=add2.getValue();
        System.out.println("result="+result);
    }
}
