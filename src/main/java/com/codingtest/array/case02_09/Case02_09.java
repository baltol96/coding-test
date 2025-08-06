package com.codingtest.array.case02_09;

import java.util.*;

public class Case02_09 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[][] array = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j] = in.nextInt();
            }
        }

        int result=0;

        for(int i=0;i<n;i++){
            int sum=0, sum1=0, sum2=0;
            for(int j=0;j<n;j++){
                sum1 += array[i][j];
                sum2 += array[j][i];
            }
            sum = Math.max(sum1, sum2);
            if(sum>result) result=sum;
        }

        int sum1 = 0;
        for(int i=0;i<n;i++){
            sum1 += array[i][i];
        }
        if(sum1>result) result=sum1;
        int sum2 = 0;
        for(int i=n-1;i>=0;i--){
            sum2 += array[i][i];
        }
        if(sum2>result) result=sum2;

        System.out.println(result);

    }

}
