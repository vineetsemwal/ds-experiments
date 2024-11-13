package designpatterns.interpreter;

public class NumberExpression implements IExpression<Integer>{
    private Integer value;
    public NumberExpression(Integer value){
        this.value=value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
