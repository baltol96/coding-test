package com.codingtest.stack_queue.case05_02;

import java.util.*;

public class Case05_02 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();
        StringBuilder result = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            if('(' == c) {
                stack.push(c);
            } else if(')' == c) {
                stack.pop();
            } else if(stack.empty()) {
                result.append(c);
            }
        }

        System.out.println(result);
    }

}
