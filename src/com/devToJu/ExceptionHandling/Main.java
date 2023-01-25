package com.devToJu.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        CriticalResource criticalResource = null;

        try {
            criticalResource = new CriticalResource();
            criticalResource.doStuff();
        }
        catch (OpeningException e) {
            System.out.println(e.getMessage());
        }
        catch (DoingException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (criticalResource != null) {
                try {
                    criticalResource.close();
                }
                catch (ClosingException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
