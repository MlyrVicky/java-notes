package com.day10.file_operations;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String fileName = "test.txt";
        File file = new File(fileName);
        file.delete();

    }
}
