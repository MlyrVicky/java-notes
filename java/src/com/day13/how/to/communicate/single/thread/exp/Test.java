package com.day13.how.to.communicate.single.thread.exp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {

            try {
                processor.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
    }
}


