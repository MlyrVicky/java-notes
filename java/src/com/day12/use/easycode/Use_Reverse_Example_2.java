package com.day12.use.easycode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Use_Reverse_Example_2 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5,6,0);

        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);
    }
}
