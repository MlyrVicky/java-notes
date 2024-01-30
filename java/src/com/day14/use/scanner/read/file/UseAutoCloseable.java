package com.day14.use.scanner.read.file;

public class UseAutoCloseable {

    public static void main(String[] args) {
      /*  AutoCloseable closeable = new AutoCloseable() {
            @Override
            public void close() throws Exception {

            }
        };
        */

        // see this is functional interface, so we can use lambda.

        AutoCloseable autoCloseable = () -> System.out.println("object close");
        try (autoCloseable) {
            System.out.println("form try ");
        } catch (Exception e) {

        }
    }
}

// this feature Introducing by java -9
/*
note : you can any object close it. use this way
       scanner also.
*/
