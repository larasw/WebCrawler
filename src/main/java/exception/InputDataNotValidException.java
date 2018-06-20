package exception;

public class InputDataNotValidException extends Exception {
    public InputDataNotValidException() {
        super();
    }

    public InputDataNotValidException(String message) {
        super(message);
    }

    public InputDataNotValidException(String message, Throwable cause) {
        super(message, cause);
    }
}
