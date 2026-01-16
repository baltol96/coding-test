package com.codingtest.stack_queue.case05_07;

import java.util.*;

public class Case05_07 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String required = in.next();
        Queue<Character> queue = new LinkedList<>();
        for(char c : required.toCharArray()) {
            queue.add(c);
        }

        String classes = in.next();
        for(char c : classes.toCharArray()) {
            if(!queue.isEmpty() && c == queue.peek()) {
                queue.poll();
            }
        }

        System.out.println(queue.isEmpty() ? "YES" : "NO");
    }

}
