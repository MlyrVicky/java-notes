package com.day7.input_out;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       /*  Write a code to get the input in the given format and print the output in the given format.

                Input Description:
        First-line indicates two integers which are the size of array and 'K' value.
        Second-line indicates an integer contains elements of an array.

        Output Description:
        Print the taken input in the same format.

        Sample Input :
        5 3
        1 2 3 4 5
        Sample Output :
        5 3
        1 2 3 4 5   */

        Scanner scanner = new Scanner(System.in);

        // Read the size of array and 'K' value5
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int size= Integer.parseInt(String.valueOf(s1.charAt(0)));
        // Create an array to store the elements
        int[] arrayElements = new int[size];
        s2=s2.replaceAll(" " ,"");
      //  System.out.println(s2);
        for (int i = 0; i < size; i++) {
           // System.out.println(i+" == Before == "+arrayElements[i]);
            arrayElements[i]= Integer.parseInt(String.valueOf(s2.charAt(i)));
           // System.out.println(i+" == After == "+arrayElements[i]);
        }
        System.out.println(s1);
        for (int i = 0; i < size; i++) {
            System.out.print(arrayElements[i]);
            if(i<size-1) System.out.print(" ");
        }
    }
}
