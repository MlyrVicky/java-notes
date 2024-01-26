package com.day_11.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Use_Optional2 {


        public static void main (String[]args){
            List<Integer> list = Arrays.asList(100, 200,300,400);
            Optional<Integer> optional = list.stream().max((i, j) -> i - j);

                System.out.println(optional.get());


            }
        }

