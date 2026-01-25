package com.codingtest.sorting_searhing.case06_07;

import java.util.*;

public class Case06_07 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            sb.append(arr[i][0]).append(' ')
              .append(arr[i][1]).append('\n');
        }

        System.out.println(sb);
    }

}
