package com.day10.file_operations.old.file.creation;

import java.io.File;
import java.io.IOException;

public class ReadFolder {
    public static void main(String[] args) throws IOException {
        String folderName = "FolderName";

        File file = new File(folderName);
        File[] files = file.listFiles();
        for(File _file : files){
        readFile(_file.getAbsolutePath());
        }
    }
    private  static void readFile(String fileName)throws IOException{

    }
}
