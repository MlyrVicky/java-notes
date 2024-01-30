package com.day10.twodymentional.array;

public class TwoDymentinalArray {
    public static void main(String[] args) {
        int [][] arr2 = new int[3][4];  // [3] is a column.  [6] is a row.
       System.out.println("arr2[0].length)  --> value is  : "+arr2[0].length);
        for(int i =0 ;i<arr2.length; i++){
            System.out.println(" this is column " + i );
            for(int j=0; j<arr2[0].length;j++){
                //System.out.println(i+" "+j);
                arr2[i][j]= 100;
                System.out.println(arr2[i][j]);
            }

        }
    }
}
