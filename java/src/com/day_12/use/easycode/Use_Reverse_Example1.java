package com.day_12.use.easycode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Use_Reverse_Example1 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,45,6,0);

        Collections.sort(list,(o1, o2) -> o2-o1);
        System.out.println(list);


        /*
        * Note : is printing reverse.highest value print first and lowest print next. this way to printing reverse
        * */
    }
}
