package com.day_11.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseLambda_In_List {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(100,200,300,40,1,0);
     //   how to get even number  ?

        List<Integer>list1 = new ArrayList<>();
        for(Integer i:list){
            if(i%2==0&&i>0){
                list1.add(i); // --> is adding the even number
                System.out.println(i);
            }

            /* Note :
            *           please check the class -->UseLambda_In_List2. because we short the code please check it.

            * */

        }
    }
}
