package br.com.booksmy.exception;

public class RequiredObjectIsNullException extends RuntimeException {
    public RequiredObjectIsNullException(){super("It is not allowed to persist a null object!");}
    public RequiredObjectIsNullException(String message) {
        super(message);
    }
}
