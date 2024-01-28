package com.day13.use.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future = executorService.submit(()->{         // use callable lambda
            Thread.sleep(2000);
            return 0;
        });

        System.out.println("from main ");
        System.out.println("from main ");
        System.out.println(future.get());
        System.out.println("from main ");
        System.out.println("from main ");
        System.out.println("from main ");
        System.out.println("from main ");
        System.out.println("from main ");

        executorService.shutdown();

    }
}

/*
note : System.out.println(future.get()); I am Print the future value is printing. but is stop the main thread.
       after executed another thread.
 */