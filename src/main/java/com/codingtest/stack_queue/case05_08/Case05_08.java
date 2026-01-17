package com.codingtest.stack_queue.case05_08;

import java.util.*;

public class Case05_08 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Queue<Person> queue = new LinkedList<>();
        for(int i=0; i<n; i++) {
            int tmp = in.nextInt();
            queue.add(new Person(i, tmp));
        }

        int result = 1;
        while(!queue.isEmpty()) {
            Person tmp = queue.poll();
            for(Person x : queue) {
                if(x.priority>tmp.priority) {
                    queue.add(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                if(tmp.id==m) break;
                else result++;
            }
        }

        System.out.println(result);
    }

}

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
