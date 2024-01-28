package com.day_10.exception_handling;

public class IndexOut {
    public static void main(String[] args) {
      int [] num = new int[10];
      try {
          System.out.println(num[20]);
      }catch (ArrayIndexOutOfBoundsException a){}
        System.out.println("this ArrayIndexOutOfBoundsException");
    }
}
