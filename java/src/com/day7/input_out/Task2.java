package com.day7.input_out;

import java.util.Scanner;

public class Task2 {

   /* Write a code to get the input in the given format and print the output in the given format

    Input Description:
    A single line contains integers separated by space

    Output Description:
    Print the integer list of integers separated by space

    Sample Input :
            2 3 4 5 6 7 8
    Sample Output :
            2 3 4 5 6 7 8  */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int n2 = s.nextInt();
        int n3= s.nextInt();
        int n4= s.nextInt();
        int n5= s.nextInt();
        int n6= s.nextInt();
        int n7= s.nextInt();
       // 2 3 4 5 6 7 8

        System.out.println(n+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);


    }

}