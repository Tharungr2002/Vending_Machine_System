package Model.State;

public class InvalidStateTransition extends RuntimeException {
    public InvalidStateTransition(String message) {
        super(message);
    }
}
