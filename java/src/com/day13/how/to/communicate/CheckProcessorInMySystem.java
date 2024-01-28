package com.day13.how.to.communicate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CheckProcessorInMySystem {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        System.out.println(Runtime.getRuntime().availableProcessors());
        executorService.shutdown();

        // your system processor checking
    }
}
