package com.codingtest.array.case02_04;

import java.util.*;

public class Case02_04_1 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        String result = "";

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            if(i == 0 || i == 1) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i-2] + arr[i-1];
            }
            result += arr[i] + " ";
        }

        System.out.println(result);
    }

}
