package com.day13.use.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HowToWriteCallableCode {
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(1);
executorService.submit(new Callable<Integer>() {

    @Override
    public Integer call() throws Exception {

        Thread.sleep(3000);
        // write the logic here
        return 0;
    }
});
    }
}
