package com.day14.list.usenull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListUseNull {
    public static void main(String[] args) {
        narmallyTheErrorHowIsHappen();
        //listOutput();
    }

    static void handleNullException() {

        List<Integer> list = Arrays.asList(12, 34, 55, 66, 77, null);

        list = list.stream().flatMap(x -> Stream.ofNullable(x)).collect(Collectors.toList());

        list = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(list);
/*
.flatMap()  --> is Introducing by java 9
        */
/*

you can use if else but it's code short format

*/
    }

    static void listOutput() {

        List<Integer> list = Arrays.asList(20, 5, 49, null, null);

        System.out.println(list);

        // normally I am getting the value its showing.

               /*

               output:

                   [20, 5, 49, null, null]

        but  am using multiple or division  is null error showing how to handle it. check another method
       */
    }

    static void narmallyTheErrorHowIsHappen() {

        List<Integer> list = Arrays.asList(12, 34, 55, 66, 77, null);

        list = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(list);

/*
output:
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "i" is null

*/

    }

}
