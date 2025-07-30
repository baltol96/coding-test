package com.codingtest.array.case02_02;

import java.util.*;

public class Case02_02 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int max = 0;
        int result = 0;
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
            if(i == 0){
                max = numbers[i];
                result++;
            }else if(numbers[i] > max){
                max = numbers[i];
                result++;
            }
        }

        System.out.println(result);
    }

}
