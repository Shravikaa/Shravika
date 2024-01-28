package exceptionassingment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileexception {
    public static void main(String[] args) {
        String filename = "c:\\c376cohort\\student.ser";
        try {
            fileFound(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void fileFound(String filename) throws FileNotFoundException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + filename + "' not found");
        }

        System.out.println(filename+" file found ");
    }
}