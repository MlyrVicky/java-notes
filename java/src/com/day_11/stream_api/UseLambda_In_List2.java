package com.day_11.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UseLambda_In_List2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 40, 0, 1);
       /* List<Integer> list1 = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                list1.add(i); // --> is adding the even number
                System.out.println(i);
            }
        }*/
        Predicate<Integer>predicate = (i)-> i%2==0;
      List<Integer> result =   list.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(result);
    }
}