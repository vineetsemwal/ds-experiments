package designpatterns.interpreter;

public class AddExpression implements IExpression<Integer>{
    private IExpression<Integer> left;
    private IExpression<Integer> right;

    public AddExpression(final IExpression<Integer> left,final IExpression<Integer> right){
        this.left=left;
        this.right=right;
    }

    @Override
    public Integer getValue() {
        return left.getValue()+right.getValue();
    }
}
