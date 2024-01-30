package com.day11.lamda.expression;

public class Test {

    interface  Bike{
        int bikeCost(int a, int b);

    }

    public static void main(String[] args) {
        Bike bike = ( a,b) -> a+b;     // this simple lambda expressions.

        int total = bike.bikeCost(200,100);
        System.out.println(total);
      //  System.out.println(bike.bikeCost(200,100));
    }

  /* is compare to functional interface and anonymous interface more than benefit to  use lambda expression.
     lambda expression -->is short the code.

   */


}
