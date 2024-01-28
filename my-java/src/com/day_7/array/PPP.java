package com.day_7.array;

import java.util.Scanner;

public class PPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array and 'K' value
        String[] inputSize = scanner.nextLine().split(" ");
        int size = Integer.parseInt(inputSize[0]);
        int k = Integer.parseInt(inputSize[1]);

        // Read the array elements
        String[] elements = scanner.nextLine().split(" ");

        for (int i = 0; i < size; i++) {
            int currentElement = Integer.parseInt(elements[i]);
            int nextElement = Integer.parseInt(elements[(i + 1) % size]);

            int diff = Math.abs(currentElement - nextElement);

            if (diff > k) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }

            // Print a space after the number except for the last one
            if (i < size - 1) {
                System.out.print(" ");
            }
        }
    }
}
