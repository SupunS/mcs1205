package sample.language.model.exceptions;

/**
 * Exception thrown when a there is a semantic error.
 */
public class SemanticException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new {@link SemanticException} with the specified detail
     * message.
     * 
     * @param message Error Message
     */
    public SemanticException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@link SemanticException} with the specified detail
     * message and cause.
     * 
     * @param message Error message
     * @param cause Cause
     */
    public SemanticException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new {@link SemanticException} with the cause.
     * 
     * @param cause Cause
     */
    public SemanticException(Throwable cause) {
        super(cause);
    }
}
