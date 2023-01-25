package com.devToJu.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try (var criticalResource = new CriticalResource()) {
            criticalResource.doStuff();
        }
        catch (OpeningException | DoingException | ClosingException e) {
            System.out.println(e.getMessage());
        }
    }
}
