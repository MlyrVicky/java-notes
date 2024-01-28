package com.day_11.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Use_Optinal {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200);
        Optional<Integer> optional = list.stream().min((i, j) -> i - j);
        if (optional.isEmpty() == false) {
            System.out.println(optional.get());

        }
    }
}
