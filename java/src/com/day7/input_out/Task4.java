package com.day7.input_out;

import java.util.Scanner;

public class Task4 {
  /*  Write a code to get the input in the given format and print the output in the given format

    Input Description:
    First-line indicates two integers separated by space. Second-line indicates two integers separated by space. Third-line indicates two integers separated by space.

    Output Description:
    Print the input in the same format.

    Sample Input :
            2 4
            2 4
            2 4
    Sample Output :
            2 4
            2 4
            2 4*/
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String s3 = s.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
