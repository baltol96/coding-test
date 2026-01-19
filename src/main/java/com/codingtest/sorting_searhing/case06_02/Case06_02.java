package com.codingtest.sorting_searhing.case06_02;

import java.util.*;

public class Case06_02 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i=0; i<n; i++) {
            result.append(arr[i]).append(" ");
        }
        System.out.println(result);
    }

}
