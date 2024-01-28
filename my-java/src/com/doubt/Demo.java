package com.doubt;

public class Demo {


    public static void main(String[] args) {

int K =3;
int L =4;
                int [][] arr2 = new int[K][L];        //System.out.println("arr2[0].length)  --> value is  : "+arr2[0].length);
                for(int i =0 ;i<K; i++){
                   // System.out.println(" this is column " + i );
                    for(int j=0; j<L;j++){


                        //System.out.println(i+" "+j);
                        arr2[i][j]= 100;
                        System.out.print(arr2[i][j]+" ");
                    }
                    System.out.println("");

                }
            }
        }



