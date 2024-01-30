package com.day7.input_out;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
      /*  Write a code to get the input in the given format and print the output in the given format

        Input Description:
        A single line contains a string.

        Output Description:
        Print the characters in a string separated by space.

                Sample Input :
        guvi
        Sample Output :
        g u v i*/


            Scanner s = new Scanner(System.in);

            String s1 = s.nextLine();

            for (int i = 0; i < s1.length(); i++) {
                System.out.print(s1.charAt(i));
                if (i < s1.length() - 1) System.out.print(" ");
            }
        }
    }
