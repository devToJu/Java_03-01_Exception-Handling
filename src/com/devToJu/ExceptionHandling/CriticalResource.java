package com.devToJu.ExceptionHandling;

public class CriticalResource implements AutoCloseable {
    public CriticalResource() throws CriticalResourceException {
        if (isRandomTrue(0.7))
            throw new CriticalResourceException(new OpeningException());

        System.out.println("Critical resource reserved!");
    }

    public void doStuff() throws CriticalResourceException {
        if (isRandomTrue(0.5))
            throw new CriticalResourceException(new DoingException());

        System.out.println("Processing...");
    }

    public void close() throws CriticalResourceException {
        if (isRandomTrue(0.4))
            throw new CriticalResourceException(new ClosingException());

        System.out.println("Critical resource released!");
    }

    private boolean isRandomTrue(double pivot) {
        return Math.random() > pivot;
    }
}
