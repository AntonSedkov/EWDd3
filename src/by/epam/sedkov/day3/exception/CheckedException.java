package by.epam.sedkov.day3.exception;

public class CheckedException extends Exception{
    public CheckedException() {
        super();
    }

    public CheckedException(String message) {
        super(message);
    }

    public CheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
