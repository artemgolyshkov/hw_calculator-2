package pro.sky.calculator.myexceptions;

public class DividerIsNullException extends IllegalArgumentException {
    public DividerIsNullException() {
    }

    public DividerIsNullException(String s) {
        super(s);
    }

    public DividerIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public DividerIsNullException(Throwable cause) {
        super(cause);
    }
}
