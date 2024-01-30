package com.day14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseDropWhile {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(34, 1, 44, 22, 56);
        list=list.stream().dropWhile(i->i%2==0).collect(Collectors.toList());

        System.out.println(list);

        /*
        note :

         this dropWhile --> lost to before calculate.  witch step is false is going to print.

           is introducing java -9

        * */
    }
}
