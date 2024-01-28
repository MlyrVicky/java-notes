package com.day13.how.to.communicate.two.thread.exp2;

import com.day13.how.to.communicate.single.thread.exp.Processor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {

            try {
                processor.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        executorService.submit(() -> {

            try {
                processor.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        executorService.shutdown();
    }
}

/*


            .shutdown() --> the Thread is fully executed is terminate
            .shutdownNow() --> is kill the Thread . is not allowing thread execution.

note : Executors.newFixedThreadPool(); --> is how many thread are executed you want. you can mention the thread number.

 */
