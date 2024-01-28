package com.day_10.file_operations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Write_The_File {
    String fileName = "test.txt";
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";

        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("hello wold");

        bufferedWriter.close();

        Path newFilePath = Paths.get(fileName);
        Files.write(newFilePath,"hello wold camming soon ".getBytes());

    }
}
