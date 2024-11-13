package com.example.demo;

public class CustomerExpressionLanguageUsage {
    public static void main(String[] args) {
        ICustomExpression<String> string = new StringExpression("Hello World");
        ICustomExpression<String>operation=new StringOperationExpression(string,
                new StringExpression("length"));
       String result =operation.getValue();
        System.out.println("result="+result);
    }
}
