package com.codingtest.sorting_searhing.case06_10;

import java.util.*;

public class Case06_10 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int result = 0;
        int lt = 1;
        int rt = arr[n-1];

        while(lt<=rt) {
            int mid = (lt+rt)/2;
            if(count(arr, mid) >= c) {
                result = mid;
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }

        System.out.println(result);
    }

    public static int count(int[] arr, int dist) {
        int cnt=1;
        int ep=arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i]-ep>=dist) {
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }

}
