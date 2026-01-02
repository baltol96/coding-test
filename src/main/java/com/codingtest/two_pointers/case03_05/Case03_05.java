package com.codingtest.two_pointers.case03_05;

import java.util.Scanner;

public class Case03_05 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int result = 0;
        int sum = 0;

        for(int i=1; i<n; i++) {
            int k = i;
            while(true){
                sum += k;
                if(sum == n){
                    result++;
                    break;
                }else if(sum > n){
                    break;
                }else{
                    k++;
                }
            }
            sum=0;
        }

        System.out.println(result);
    }

}
