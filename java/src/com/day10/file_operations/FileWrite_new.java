package com.day10.file_operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWrite_new {

    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        Path newFilePath = Paths.get(fileName);
        Files.write(newFilePath,"hello wold camping soon ".getBytes());

    }
}
