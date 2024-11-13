package com.example.demo;

public class StringExpression implements ICustomExpression<String> {
    private String value;

    public StringExpression(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
