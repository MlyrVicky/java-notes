package com.day12.method.referance;

public interface Use_MethodRefarance2 {
    void amount1(int a, int b);
    //String carName (String name,String bikeName);


    class Ducati {

        public static void cost(int a, int b) {
            System.out.println("static method value : " +(a + b));
        }

        public  int bikeName(int a, int b) {
            System.out.println("this  public  method value : "+(a+b));
            return a+b;
        }


        public static void main(String[] args) {
            Use_MethodRefarance2 I1 = Ducati::cost;
               Ducati d = new Ducati();

               cost(400,400); // this static method

               d.bikeName(200,200); // this is public method is a return type.
               I1 =d::bikeName;

        }
    }
}
