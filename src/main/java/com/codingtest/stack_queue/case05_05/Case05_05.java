package com.codingtest.stack_queue.case05_05;

import java.util.*;

public class Case05_05 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();
        Stack<Character> stack = new Stack<>();
        char tmp = ' ';

        int result = 0;

        for(char c : input.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                stack.pop();
                if(tmp == ')') {
                    result++;
                } else if(tmp == '(') {
                    result += stack.size();
                }
            }
            tmp = c;
        }

        System.out.println(result);
    }

}
