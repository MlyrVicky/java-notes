package com.day_11.stream_api;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Use_Optional4 {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList();
        Optional<Integer> optional = list.stream().min((i, j) -> i - j);

            System.out.println(optional.orElse(348));


        }
    }


