package com.codingtest.sorting_searhing.case06_01;

import java.util.*;

public class Case06_01 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        for(int i=0; i<n; i++) {
            int idx = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        StringBuilder result = new StringBuilder();
        for(int i=0; i<n; i++) {
            result.append(arr[i]).append(" ");
        }
        System.out.println(result);
    }

}
