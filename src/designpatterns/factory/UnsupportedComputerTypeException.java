package designpatterns.factory;

public class UnsupportedComputerTypeException extends RuntimeException {
    public UnsupportedComputerTypeException(String message) {
        super(message);
    }
    public UnsupportedComputerTypeException(String message, Throwable cause) {
        super(message, cause);
    }
}
