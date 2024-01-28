package com.day_11.stream_api;

import java.util.Arrays;
import java.util.List;

public class Use_Consumer_In_List {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(100,200,300,400);

        list.forEach(i-> System.out.println(i));

    }
}
