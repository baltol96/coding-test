package com.codingtest.array.case02_03;

import java.util.*;

public class Case02_03 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        String[] result = new String[n];

        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
            b[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
            if(a[i]==b[i]) result[i]="D";
            else if(a[i] == 1) {
                if(b[i] == 2) result[i]="B";
                else result[i]="A";
            } else if(a[i] == 2) {
                if(b[i] == 3) result[i]="B";
                else result[i]="A";
            } else if(a[i] == 3) {
                if(b[i] == 1) result[i]="B";
                else result[i]="A";
            }
        }

        for(String str:result){
            System.out.println(str);
        }
    }

}
