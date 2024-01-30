package com.day6;

import java.util.Stack;

public class Use_Peek {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(500);
        stack.push(300);
        stack.push(100);

        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
