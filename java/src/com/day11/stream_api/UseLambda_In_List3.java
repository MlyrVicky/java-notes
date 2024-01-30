package com.day11.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UseLambda_In_List3 {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(100,200,0,1);

        Predicate<Integer> predicate = (i)-> i%2==0;


       List<Integer> result =list.stream().filter(predicate).map(i->i*i).collect(Collectors.toList());


        System.out.println(result);
            }
        }
