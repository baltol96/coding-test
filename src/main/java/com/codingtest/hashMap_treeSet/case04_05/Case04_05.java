package com.codingtest.hashMap_treeSet.case04_05;

import java.util.*;

public class Case04_05 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int result = -1;

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        Set<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int l=j+1; l<n; l++) {
                    treeSet.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt = 0;
        for(int x : treeSet) {
            cnt++;
            if(cnt==k) result = x;
        }

        System.out.println(result);
    }

}
