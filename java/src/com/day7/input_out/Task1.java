package com.day7.input_out;

import java.util.Scanner;

public class Task1 {

  /*  Write a code to get the input in the given format and print the output in the given format

    Input Description:
    To take an integer value

    Output Description:
    Print the integer value

    Sample Input :
            2
    Sample Output :
            2*/


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(n);
    }
}
