package com.day10.file_operations.old.file.creation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OldFile {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "test.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
    }
}
