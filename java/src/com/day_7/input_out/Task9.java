package com.day_7.input_out;

import java.util.Scanner;

public class Task9 {
  /*  Write a code to get the input in the given format and print the output in the given format.

    Input Description:
    A single line contains a string.

    Output Description:
    Print the characters in a string separated by line.

    Sample Input :
    guvigeek
    Sample Output :
    g
            u
    v
            i
    g
            e
    e
            k
*/

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
         for(int i =0 ;i<s1.length();i++){
             String s2 = String.valueOf(s1.charAt(i));
             System.out.println(s2);
         }
    }

}
