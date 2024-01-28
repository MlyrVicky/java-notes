package com.day13.how.to.communicate.thread.use.fixed.rate;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {


    public static void main(String[] args) {
       Processor processor = new Processor();
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleAtFixedRate(() -> {
            try {
                processor.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        },0,60, TimeUnit.SECONDS);


        executorService.shutdown();
    }
}
/*
    scheduleAtFixedRate(() --> how is work it --> is like  credit  the salary.
*/
    /*
     note : like this way communicate on two thread.
          : we use .notify() -> this is relies the thread lock.
          : we use .waite()  -> is waiting  for the particular function.
                                if not mention .waite(); is continue looping.
     */
