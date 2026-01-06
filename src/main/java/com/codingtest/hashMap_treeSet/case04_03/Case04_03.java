package com.codingtest.hashMap_treeSet.case04_03;

import java.util.*;

public class Case04_03 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        StringBuilder result = new StringBuilder();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        result.append(map.size()).append(" ");

        for(int i=k; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            map.put(arr[i-k], map.getOrDefault(arr[i-k],0)-1);

            if(map.get(arr[i-k]) <= 0) {
                map.remove(arr[i-k]);
            }

            result.append(map.size()).append(" ");
        }

        System.out.println(result);
    }

}
