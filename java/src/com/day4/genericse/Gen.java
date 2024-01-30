package com.day4.genericse;

public class Gen <T extends  Number>{

    // <>  --> this  Generics
   /*  T   --> for type. it can be change any letter like A, B, C, etc..
     T is code reading purpose that why we mention T.*/
    public T  obj;

    public T getObj(){
        return obj;
    }

}
