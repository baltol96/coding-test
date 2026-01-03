package com.codingtest.two_pointers.case03_06;

import java.util.Scanner;

public class Case03_06 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int result = 0;
        int cnt = 0;
        int lt = 0;

        for(int rt=0; rt<n; rt++) {
            if(arr[rt]==0) cnt++;
            while(cnt>k) {
                if(arr[lt]==0) cnt--;
                lt++;
            }
            result = Math.max(result, rt-lt+1);
        }

        System.out.println(result);
    }

}
