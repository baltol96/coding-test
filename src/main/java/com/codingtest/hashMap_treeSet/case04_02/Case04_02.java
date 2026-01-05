package com.codingtest.hashMap_treeSet.case04_02;

import java.util.*;

public class Case04_02 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        String result = "YES";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c : input1.toCharArray()) {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        for(char c : input2.toCharArray()) {
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        for(char c : map1.keySet()) {
            if(map2.containsKey(c)) {
                if(map1.get(c) != map2.get(c)) {
                    result = "NO";
                }
            } else {
                result = "NO";
                break;
            }
        }

        System.out.println(result);
    }

}
