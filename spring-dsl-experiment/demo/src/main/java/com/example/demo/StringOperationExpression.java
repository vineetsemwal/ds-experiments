package com.example.demo;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public class StringOperationExpression implements ICustomExpression<String> {
    private ICustomExpression<String> value;
    private ICustomExpression<String> methodExpression;

    public StringOperationExpression(final ICustomExpression<String> left,
                                     final ICustomExpression<String> right) {
        this.value = left;
        this.methodExpression = right;
    }

    @Override
    public String getValue() {
        Optional<Method> optional = Arrays.stream(String.class.getMethods())
                .filter(method -> method.getName().equalsIgnoreCase(methodExpression.getValue()))
                .findFirst();

        if (optional.isPresent()) {
            try {
                return optional.get().invoke(value.getValue()).toString();
            } catch (Exception e) {
               throw new OperationInvokeException("Error invoking method", e);
            }
        }

        return value.getValue();

    }
}
