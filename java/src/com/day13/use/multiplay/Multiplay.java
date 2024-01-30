package com.day13.use.multiplay;

public class Multiplay {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 4},
                {4, 3, 2},
                {4, 5, 6}
        };

        int[][] b = {
                {1, 2, 4},
                {4, 3, 2},
                {4, 5, 6}
        };
        int[][] result = multiblyMat(a, b, a.length, a[0].length, b.length, b[0].length);
        printMat(result);
    }

    private static int[][] multiblyMat(int[][] a, int[][] b, int rowA, int colA, int rowB, int colB) {
        int[][] result = new int[rowA][rowB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                int sum = 0;
                for (int k = 0; k < colA; k++) {
                    sum = sum + a[i][k] * b[k][j];

                }
                result[i][j] = sum;
            }
        }

        return result;
    }


    private static void printMat(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}


/*
note : use
completable Thread   Then solving this multiply
*/