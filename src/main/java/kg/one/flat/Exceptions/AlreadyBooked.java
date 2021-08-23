package kg.one.flat.Exceptions;

public class AlreadyBooked extends RuntimeException {
    public AlreadyBooked(String message) {
        super(message);
    }
}
