package com.devToJu.ExceptionHandling;

public class CriticalResource implements AutoCloseable {
    public CriticalResource() throws OpeningException {
        if (isRandomTrue(0.7))
            throw new OpeningException();

        System.out.println("Critical resource reserved!");
    }

    public void doStuff() throws DoingException {
        if (isRandomTrue(0.5))
            throw new DoingException();

        System.out.println("Processing...");
    }

    public void close() throws ClosingException {
        if (isRandomTrue(0.4))
            throw new ClosingException();

        System.out.println("Critical resource released!");
    }

    private boolean isRandomTrue(double pivot) {
        return Math.random() > pivot;
    }
}
