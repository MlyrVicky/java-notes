package com.day13.use.comletaple.future;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UseThenApplyAsync {
    ExecutorService executorService = Executors.newFixedThreadPool(2);

    CompletableFuture<String> yourNameFuture = CompletableFuture.supplyAsync(() -> {
        try {
            Thread.sleep(1000);
            System.out.println("form child ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "java";
    });
    CompletableFuture<String> completableFuture = yourNameFuture.thenApplyAsync(name -> {
        return "hello" + name;
    });

     
}


