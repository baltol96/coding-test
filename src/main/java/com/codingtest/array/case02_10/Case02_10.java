package com.codingtest.array.case02_10;

import java.util.*;

public class Case02_10 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int result = 0;

        int[][] array = new int[n+2][n+2];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                array[i][j]=in.nextInt();
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(calc(array[i][j], array[i-1][j], array[i+1][j], array[i][j-1], array[i][j+1])) result++;
            }
        }

        System.out.println(result);

    }

    private static boolean calc(int x, int a, int b, int c, int d){
        return x > a && x > b && x > c && x > d;
    }

}
