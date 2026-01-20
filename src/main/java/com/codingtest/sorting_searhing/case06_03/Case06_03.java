package com.codingtest.sorting_searhing.case06_03;

import java.util.*;

public class Case06_03 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        for(int i=1; i<n; i++) {
            int tmp = arr[i];
            int j;
            for( j=i-1; j>=0; j--) {
                if(arr[j]>tmp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }

        StringBuilder result = new StringBuilder();
        for(int i=0; i<n; i++) {
            result.append(arr[i]).append(" ");
        }
        System.out.println(result);
    }

}
