package com.day_7.input_out;

import java.util.Scanner;

public class Task8 {
   /* Write a code to get the input in the given format and print the output in the given format.

    Input Description:
    A single line contains three float values separated by space.

    Output Description:
    Print the float value separated by line.

    Sample Input :
            2.3 4.5 7.8
    Sample Output :
            2.3
            4.5
            7.8  */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

      String []value = s.nextLine().split(" ");

      for(String v:value){
          System.out.println(v);
      }
    }

}
