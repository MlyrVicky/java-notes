package com.day_7.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            Integer n = scanner.nextInt();

            List<Integer> list = new ArrayList<>();

            list.add(1000);
            list.add(2000);
            list.add(4000);
            list.add(7000);

            System.out.println(list.get(n));




        }



    }


