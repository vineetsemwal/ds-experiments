package com.example.demo;

public class OperationInvokeException extends RuntimeException {
    public OperationInvokeException(String message) {
        super(message);
    }
    public OperationInvokeException(String message,Throwable cause){
        super(message,cause);
    }
}
