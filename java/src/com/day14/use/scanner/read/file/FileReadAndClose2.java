package com.day14.use.scanner.read.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadAndClose2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));

        try(scanner){

        }catch (Exception e){

        }
    }
}
