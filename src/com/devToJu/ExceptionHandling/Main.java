package com.devToJu.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        readFromFile("FileNotExists.txt");
    }

    public static void readFromFile(String fileName) {
        FileReader reader = null;

        try {
            reader = new FileReader(fileName);
            System.out.println(reader.read());
        }
        catch (FileNotFoundException e) {
            System.out.println(fileName + " doesn't exist");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                }
                catch (IOException e) {
                    System.out.println("Couldn't close reader: " + e.getMessage());
                }
            }
        }
    }
}
