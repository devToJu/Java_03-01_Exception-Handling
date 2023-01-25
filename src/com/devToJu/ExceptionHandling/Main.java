package com.devToJu.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try (var criticalResource = new CriticalResource()) {
            criticalResource.doStuff();
        }
        catch (CriticalResourceException e) {
            var causeException = e.getCause();
            System.out.println(causeException.getMessage());
        }
    }
}
