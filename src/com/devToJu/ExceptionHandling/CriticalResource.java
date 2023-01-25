package com.devToJu.ExceptionHandling;

public class CriticalResource implements AutoCloseable {
    public CriticalResource() throws CriticalResourceException {
        if (isRandomTrue(0.7)) {
            var criticalRessourceException = new CriticalResourceException();
            var openingException = new OpeningException();

            criticalRessourceException.initCause(openingException);
            throw criticalRessourceException;
        }


        System.out.println("Critical resource reserved!");
    }

    public void doStuff() throws CriticalResourceException {
        if (isRandomTrue(0.5)) {
            var criticalRessourceException = new CriticalResourceException();
            var doingException = new DoingException();

            criticalRessourceException.initCause(doingException);
            throw criticalRessourceException;
        }

        System.out.println("Processing...");
    }

    public void close() throws CriticalResourceException {
        if (isRandomTrue(0.4)) {
            var criticalRessourceException = new CriticalResourceException();
            var closingException = new ClosingException();

            criticalRessourceException.initCause(closingException);
            throw criticalRessourceException;
        }

        System.out.println("Critical resource released!");
    }

    private boolean isRandomTrue(double pivot) {
        return Math.random() > pivot;
    }
}
