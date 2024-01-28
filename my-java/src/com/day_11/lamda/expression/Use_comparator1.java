package com.day_11.lamda.expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Use_comparator1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

         Collections.sort(list,( o1, o2) -> o2-o1);
        System.out.println(list);
        }
    }
/*
*      we use comparator right. the previous class topic. we use comparable and comparator right this are big code .
*        So now we're using lambda the code is short.
* */
/*
note : we change the return type  o2-o1 that why the list is printing descending order.

*/

