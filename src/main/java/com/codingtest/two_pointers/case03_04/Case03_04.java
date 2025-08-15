package com.codingtest.two_pointers.case03_04;

import java.util.*;

public class Case03_04 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int cnt=0;
        int sum=0;
        int lt=0,rt=0;
        while (rt < n) {
            sum += arr[rt++];
            while (sum >= m) {
                if (sum == m) cnt++;
                sum -= arr[lt++];
            }
        }
        System.out.println(cnt);

    }

}
