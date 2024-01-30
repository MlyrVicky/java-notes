package com.day13.use.comletaple.useThenApplyAsync;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UseThenApplyAsync1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletableFuture<String> yourNameFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "java";
        });
        CompletableFuture<String> greetingFuture = yourNameFuture.thenApplyAsync(name -> {
            return "hello" + name;
        });
        System.out.println("from main ");
        /*
          this area I what separate thread. like use multiple thread. if I want to stop use [(thread name .get());]is finishing Then another Thread is running.
        */
        System.out.println(greetingFuture.get());
          executorService.shutdown();
    }
}

/*
 note :  .thenApplysync --> is combine [ yourNameFuture,greetingFuture ]
*/
