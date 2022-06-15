package com.company;


public class UserRegistrationException extends RuntimeException {
    public ExceptionType type;

    public enum ExceptionType {
        INVALID_USER_FIRST_NAME, INVALID_USER_LAST_NAME, INVALID_USER_MOBILE_NUMBER, INVALID_USER_MAIL_ID, INVALID_USER_PASSWORD,
    }

    public UserRegistrationException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}

