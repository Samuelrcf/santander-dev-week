package com.samuelr.santander_dev_week.exception;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}