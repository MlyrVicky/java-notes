package com.day13.use.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableNoVeriableMention {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<?> future= executorService.submit(() -> {       // this lambda call to callable

            Thread.sleep(3000);
            // write the logic here
            int  i =20;
            System.out.println(i);
            return i;
        });
    }
}


// if you mention Future<?> like this. you can any variable data you mention is accepting.