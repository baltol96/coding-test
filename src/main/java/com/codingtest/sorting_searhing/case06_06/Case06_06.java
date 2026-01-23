package com.codingtest.sorting_searhing.case06_06;

import java.util.*;

public class Case06_06 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        String result = "";
        for(int i=0; i<n; i++) {
            if(arr[i] != tmp[i]) {
                result += i+1 + " ";
            }
        }

        System.out.println(result);
    }

}
