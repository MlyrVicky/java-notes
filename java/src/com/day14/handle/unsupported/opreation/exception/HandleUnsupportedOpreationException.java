package com.day14.handle.unsupported.opreation.exception;



import java.util.Arrays;
import java.util.List;

public class HandleUnsupportedOpreationException {
    public static void main(String[] args) {


        //wrongWayUsing();
        correctWayUsing();
    }


    static void wrongWayUsing() {
        List<Integer> list = Arrays.asList(1, 2, 3, 45, 6);
        list.remove(3);
        System.out.println(list);

        /*
        why this error is happen
  Arrays.asList(); --->  it is immutable. you can't add anything, and you can't delete anything.
                         so that why the error is showing.

        */

    }

    static void correctWayUsing() {
        List<Integer> list = new java.util.ArrayList<>(List.of(1, 2, 3, 565));
        Integer remove = list.remove(3);
        System.out.println(list);

        /*
      List.of()  this giving immutable list so use this way. you can delete .
        */
    }


}
