package com.codingtest.two_pointers.case03_02;

import java.util.*;

public class Case03_02_1 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String result = "";

        int n = in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }

        int m = in.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=in.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int x=0,y=0;
        while(x<n && y<m){
            if(a[x]==b[y]){
                result += a[x]+" ";
                x++;
                y++;
            }
            else if(a[x]<b[y]) x++;
            else y++;
        }

        System.out.println(result);

    }

}
