package com.codingtest.two_pointers.case03_01;

import java.util.*;

public class Case03_01 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String result = "";

        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i]=in.nextInt();
        }

        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=in.nextInt();
        }

        int p1=0,p2=0;
        while(p1<n1 && p2<n2){
            if(arr1[p1]<arr2[p2]) result+=arr1[p1++]+" ";
            else result+=arr2[p2++]+" ";
        }
        while(p1<n1) result+=arr1[p1++]+" ";
        while(p2<n2) result+=arr2[p2++]+" ";

        System.out.println(result);

    }

}
