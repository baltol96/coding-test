package com.codingtest.hashMap_treeSet.case04_01;

import java.util.*;

public class Case04_01 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        char result = ' ';

        Map<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int max = 0;
        for(char c : map.keySet()) {
            int cnt = map.get(c);
            if(cnt>max) {
                max=cnt;
                result = c;
            }
        }

        System.out.println(result);
    }

}
