package com.codingtest.array.case02_01;

import java.util.*;

public class Case02_01 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        String result = "";

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            if(i == 0) result += arr[0] + " ";
            else if(arr[i] > arr[i-1]) result += arr[i] + " ";
        }

        System.out.println(result);

    }

}
