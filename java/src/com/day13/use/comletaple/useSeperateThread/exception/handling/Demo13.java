package com.day13.use.comletaple.useSeperateThread.exception.handling;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo13 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletableFuture<Double> wightFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 70.0;
        }, executorService).exceptionally(ex->{
            System.out.println(ex.getMessage());
            return 0.0;
        });

        CompletableFuture<Double> hightFuture = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 176.9;
        }, executorService);

        CompletableFuture<Double> bmiFuture = wightFuture.thenCombine(hightFuture, (weight, height) -> weight / (height * weight));

        // separate Thread Executed this.

        System.out.println(bmiFuture.get());

        executorService.shutdown();

    }
}
