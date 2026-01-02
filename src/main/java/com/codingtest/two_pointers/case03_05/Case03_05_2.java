package com.codingtest.two_pointers.case03_05;

import java.util.Scanner;

public class Case03_05_2 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = n/2+1;
        int result = 0;
        int sum = 0;
        int lt = 0;

        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = i+1;
        }

        for(int rt=0; rt<=m; rt++){
            sum+=array[rt];
            if(sum==n) result++;
            while(sum>=n){
                sum-=array[lt++];
                if(sum==n) result++;
            }
        }

        System.out.println(result);
    }

}
