package com.day_7.input_out;

import java.util.Scanner;

public class Task5 {
 /*   Write a code to get the input in the given format and print the output in the given format

    Input Description:
    Three integers are given in line by line.

    Output Description:
    Print the integers in a single line separate by space.

    Sample Input :
            2
            4
            5
    Sample Output :
            2 4 5 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        System.out.println(n1+" "+n2+" "+n3);
    }
}
