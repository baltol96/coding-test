package com.codingtest.stack_queue.case05_06;

import java.util.*;

public class Case05_06 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++) {
            queue.add(i);
        }
        while(queue.size() != 1) {
            for(int i=1; i<=k; i++) {
                if(i==k) {
                    queue.poll();
                } else {
                    queue.add(queue.poll());

                }
            }
        }

        System.out.println(queue.poll());
    }

}
