package com.day13.use.Thread.read.your.system.folder;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReadYourSytemFolder {
    public static void main(String[] args) {
        int threads = 20;
        ExecutorService executorService = Executors.newFixedThreadPool(threads);

        File folder = new File("D:\\vicky");

        File[] files = folder.listFiles();

        for(int i =0 ;i<threads;i++){
            assert files != null;
            String file = files[i].getAbsolutePath();
            executorService.submit(()-> {
                //read file
                System.out.println(file);
            });
        }

    }
}
