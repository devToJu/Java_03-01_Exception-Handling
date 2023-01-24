package com.devToJu.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        readFromFile("FileNotExists.txt");
    }

    public static void readFromFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            System.out.println(reader.read());
        }
        catch (FileNotFoundException e) {
            System.out.println(fileName + " doesn't exist");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
