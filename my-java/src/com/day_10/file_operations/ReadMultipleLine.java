package com.day_10.file_operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLine {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();


while(line !=null){
    System.out.println(line);
   line = bufferedReader.readLine();
}

    }
}

