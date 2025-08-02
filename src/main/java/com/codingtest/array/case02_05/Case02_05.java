package com.codingtest.array.case02_05;

import java.util.*;

public class Case02_05 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[] a=new int[n+1];
        int cnt = 0;

        for(int i=2;i<=n;i++){
            if(a[i]==0){
                cnt++;
                for(int j=i;j<=n;j+=i){
                    a[j]=1;
                }
            }
        }

        System.out.println(cnt);
    }

}
