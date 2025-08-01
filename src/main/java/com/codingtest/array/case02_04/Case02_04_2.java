package com.codingtest.array.case02_04;

import java.util.*;

public class Case02_04_2 {

    //배열 사용 안하는 방식
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int a=1,b=1,c;

        String result = a + " " + b + " ";

        for(int i=2;i<n;i++) {
            c=a+b;
            result += c + " ";
            a=b;
            b=c;
        }

        System.out.println(result);
    }

}
