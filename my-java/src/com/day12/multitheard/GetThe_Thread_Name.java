package com.day12.multitheard;

public class GetThe_Thread_Name {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
    }
}
