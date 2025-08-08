package com.codingtest.array.case02_11;

import java.util.*;

public class Case02_11 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int answer = -1;
        int result = -1;

        int[][] array = new int[n][5];

        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                array[i][j] = in.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(j!=i){
                    for(int k=0;k<5;k++){
                        if(array[i][k]==array[j][k]){
                            cnt++;
                            break;
                        }
                    }
                }
            }
            if(cnt>result){
                result = cnt;
                answer = i+1;
            }
        }

        System.out.println(answer);
    }

}
