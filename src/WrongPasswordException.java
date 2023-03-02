public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String wrongPasswordException) {
        super(wrongPasswordException);
    }
}
