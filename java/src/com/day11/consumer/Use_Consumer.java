package com.day11.consumer;

import java.util.function.Consumer;

public class Use_Consumer {
    public static void main(String[] args) {
        Consumer <Integer> consumer = (i) -> System.out.println(i);

             consumer.accept(101);
        }
    }

