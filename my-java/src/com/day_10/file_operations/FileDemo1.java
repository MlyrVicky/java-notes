package com.day_10.file_operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo1 {
    public static void main(String[] args)  {
        String fileName ="fileDemo.txt";

        Path newFilepath  =  Paths.get(fileName);
        try {
            Files.createFile(newFilepath);
        }catch (IOException i){
            System.out.println( "IOException is handle. IOException means file input output exceptions  ");
        }
    }
}
