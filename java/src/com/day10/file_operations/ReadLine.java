package com.day10.file_operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        System.out.println(line);

    }
}
