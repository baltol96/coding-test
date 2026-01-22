package com.codingtest.sorting_searhing.case06_05;

import java.util.*;

public class Case06_05 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        String result = "U";

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            if(arr[i] == arr[i+1]) {
                result = "D";
                break;
            }
        }

//        Set<Integer> set = new HashSet<>();
//        for(int i=0; i<n; i++) {
//            int num = in.nextInt();
//            if(!set.add(num)) {
//                result="D";
//                break;
//            }
//        }

        System.out.println(result);
    }

}
