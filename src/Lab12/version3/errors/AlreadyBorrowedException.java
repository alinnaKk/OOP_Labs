package Lab12.version3.errors;

public class AlreadyBorrowedException extends RuntimeException {
    public AlreadyBorrowedException(String message) {
        super(message);
    }
}
