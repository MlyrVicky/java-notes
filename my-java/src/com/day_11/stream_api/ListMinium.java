package com.day_11.stream_api;

import java.util.Arrays;
import java.util.List;

public class ListMinium {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100,200,0,300);
        System.out.println(list.stream().min((i,j)->i-j).get());
        System.out.println(list.stream().max((i,j)-> i-j).get());

    }
}
