public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String wrongLoginException) {
        super(wrongLoginException);
    }
}
