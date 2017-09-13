public class NoTransportException extends RuntimeException {
    public NoTransportException() {
    }

    public NoTransportException(String message) {
        super(message);
    }

    public NoTransportException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoTransportException(Throwable cause) {
        super(cause);
    }

    public NoTransportException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}