package com.codingtest.array.case02_07;

import java.util.*;

public class Case02_07 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int result = 0, cnt = 1;

        for(int i=0;i<n;i++){
            int x=in.nextInt();
            if(x == 1){
                result += cnt;
                cnt++;
            }else{
                cnt = 1;
            }
        }

        System.out.println(result);
    }

}
