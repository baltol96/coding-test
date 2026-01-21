package com.codingtest.sorting_searhing.case06_04;

import java.util.*;

public class Case06_04 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();

        //1 2 3 2 6 2 3 5 7
        int[] cache = new int[s];
        for(int i=0; i<n; i++) {
            int num = in.nextInt();

            boolean hit = false;
            int pos = 0;
            for(int k=0; k<s; k++) {
                if(cache[k]==num) {
                    hit = true;
                    pos = k;
                    break;
                }
            }

            if(hit) {
                for(int j=pos; j>0; j--) {
                    cache[j] = cache[j-1];
                }
            } else {
                for(int j=s-1; j>0; j--) {
                    cache[j] = cache[j-1];
                }
            }
            cache[0] = num;


        }

        StringBuilder result = new StringBuilder();
        for (int j : cache) {
            result.append(j).append(" ");
        }
        System.out.println(result);
    }

}
