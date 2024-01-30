package com.day14.use.scanner.read.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndClose1 {
    public static void main(String[] args) {

        Scanner s = null;
        try {
            s = new Scanner(new File("file.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}

/*
note :
not only Scanner using StringBuffer, StringBuilder using to this Scanner closer.Then closing the reading.
*/