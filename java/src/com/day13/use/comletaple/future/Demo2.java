package com.day13.use.comletaple.future;

import java.util.concurrent.*;

public class Demo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("form child ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "from completable future";
        }, executorService);
        System.out.println(completableFuture.get());
        System.out.println("form main");
        executorService.shutdown();

    }
}

