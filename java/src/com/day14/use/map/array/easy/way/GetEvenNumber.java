package com.day14.use.map.array.easy.way;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetEvenNumber {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(134,40,10,5,9,16);

       list= list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list);

        // get the even number.
    }
}
