package com.day7.absolutebeginner;

import java.util.Scanner;

public class Task2 {
/*    You are given Two Numbers, A and B. If C = A + B. Find C.

            Note: Round off the output to a single decimal place.

    Input Description:
    You are provided with two numbers A and B.

    Output Description:
    Find the sum of the two numbers (A + B)

    Sample Input :
            1
            1
    Sample Output :
            2 */

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
/*    Scanner scanner = new Scanner(System.in);


        double A =scanner.nextDouble();
        System.out.println();
        double B =scanner.nextDouble();
        System.out.println();

        double C = A+B;
        System.out.println(Math.round(C));


}*/
/*
        Scanner scanner = new Scanner(System.in);

        // Read the first number (A) from the user
        System.out.println();
        double A = scanner.nextDouble();

        // Read the second number (B) from the user
        System.out.println();
        double B = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the sum (C = A + B)
        double C = A + B;

        // Print the rounded sum to a single decimal place
        System.out.println(Math.round(C));
    }*/


        Scanner scanner = new Scanner(System.in);



        double A = scanner.nextDouble();


        double B = scanner.nextDouble();

        scanner.close();

        double C = A + B;

        System.out.println(Math.round(C));
    }


}
