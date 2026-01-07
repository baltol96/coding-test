package com.codingtest.hashMap_treeSet.case04_4;

import java.util.*;

public class Case04_04 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int result = 0;
        char[] array = s.toCharArray();
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) +1);
        }

        for(int i=0; i<t.length()-1; i++) {
            mapS.put(array[i], mapS.getOrDefault(array[i], 0)+1);
        }

        int lt = 0;
        for(int rt=t.length()-1; rt<s.length(); rt++) {
            mapS.put(array[rt], mapS.getOrDefault(array[rt], 0)+1);
            if(mapS.equals(mapT)) result++;
            mapS.put(array[lt], mapS.getOrDefault(array[lt], 0)-1);
            if(mapS.get(array[lt]) == 0) mapS.remove(array[lt]);
            lt++;
        }

        System.out.println(result);
    }

}
