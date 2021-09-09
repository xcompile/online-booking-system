package com.hongkongcoder.salon.exception;

public class SalonException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public SalonException() {
    }

    public SalonException(String message) {
        super(message);
    }

    public SalonException(Throwable cause) {
        super(cause);
    }

    public SalonException(String message, Throwable cause) {
        super(message, cause);
    }

    public SalonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
