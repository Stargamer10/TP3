package exceptions;

public class PileException extends RuntimeException {
    PileException() {
        super();
    }

    PileException(String message) {
        super(message);
    }
}
