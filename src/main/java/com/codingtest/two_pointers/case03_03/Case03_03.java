package com.codingtest.two_pointers.case03_03;

import java.util.*;

public class Case03_03 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }


        int result=0;
        for(int i=0;i<k;i++){
            result += arr[i];
        }
        int sum=result;
        for(int i=k;i<n;i++){
            sum=sum-arr[i-k]+arr[i];
            if(sum>result) result=sum;
        }

        System.out.println(result);

    }

}
