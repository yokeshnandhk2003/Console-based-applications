package exceptions;

public class NoTaxiAvailableException extends RuntimeException{
    public NoTaxiAvailableException(String message) {
        super(message);
    }
}
