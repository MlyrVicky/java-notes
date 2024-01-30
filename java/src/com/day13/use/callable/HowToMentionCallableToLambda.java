package com.day13.use.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HowToMentionCallableToLambda {
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {       // this lambda call to callable

            Thread.sleep(3000);
            // write the logic here
            return 0;
        });
    }
}

// this way mention to lambda function.