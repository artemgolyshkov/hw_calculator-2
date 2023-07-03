package pro.sky.calculator.myexceptions;

public class InvalidValueException extends IllegalArgumentException {
    public InvalidValueException() {
    }

    public InvalidValueException(String s) {
        super(s);
    }

    public InvalidValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidValueException(Throwable cause) {
        super(cause);
    }
}
