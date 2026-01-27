package com.codingtest.sorting_searhing.case06_08;

import java.util.*;

public class Case06_08 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int result = 0;
        int lt=0, rt=n-1;
        while(true) {

            int mid = (lt+rt)/2;
            if(arr[mid] == m) {
                result = mid+1;
                break;
            }else if(arr[mid] > m) {
                rt = mid-1;
            } else {
                lt = mid+1;
            }

        }

        System.out.println(result);
    }

}
