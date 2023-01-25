package com.devToJu.ExceptionHandling;

public class ClosingException extends Exception {
    public ClosingException() {
        super("Exception while closing resource.");
    }
}
