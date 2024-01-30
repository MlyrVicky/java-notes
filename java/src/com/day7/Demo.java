package com.day7;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


   /*     //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        int n2 = obj.nextInt();
        System.out.print(userInput);
        System.out.print(" "+n2);*/


        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input side length
        System.out.print("Enter the side length of the equilateral triangle: ");
        double sideLength = scanner.nextDouble();

        // Calculate area
        double area = (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);

        // Print the result rounded to 2 decimal places
        System.out.printf( "%.2f%n", area);

        //173.205 -> 17320.5 -> 17321 -> 173.21
        // -> x= x*100 -> x= Math.round(x) -> x= x/100

        System.out.println(Math.round(area));

        // Close the scanner to prevent resource leak



    }
    }




