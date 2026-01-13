package com.codingtest.stack_queue.case05_04;

import java.util.*;

public class Case05_04 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();

        Stack<Integer> stack = new Stack<>();
//        String s = "+-*/";

        for(char c : input.toCharArray()) {
//            if(s.contains(String.valueOf(c))) {
            if(!Character.isDigit(c)) {
                int last = stack.pop();
                int first = stack.pop();
                if(c == '+') {
                    stack.push(first + last);
                } else if(c == '-') {
                    stack.push(first - last);
                } else if(c == '*') {
                    stack.push(first * last);
                } else if(c == '/') {
                    stack.push(first / last);
                }
            } else {
                stack.push(Integer.parseInt(String.valueOf(c)));
            }
        }

        System.out.println(stack.pop());
    }

}
