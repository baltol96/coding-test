package com.codingtest.stack_queue.case05_01;

import java.util.*;

public class Case05_01 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();

        Stack<Character> stack = new Stack<>();

        String result = "YES";

        for(char c : input.toCharArray()) {
            if('(' == c) {
                stack.add(c);
            } else {
                if(stack.empty()) {
                    result = "NO";
                } else {
                    stack.pop();
                }
            }
        }

        if(!stack.empty()) result = "NO";

        System.out.println(result);
    }

}
