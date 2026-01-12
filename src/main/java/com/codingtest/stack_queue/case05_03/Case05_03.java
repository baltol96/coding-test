package com.codingtest.stack_queue.case05_03;

import java.util.*;

public class Case05_03 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int result = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[j][i] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];

        for(int i=0; i<m; i++) {
            moves[i] = in.nextInt()-1;
        }

        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < n; j++) {
                if (arr[move][j] != 0) {
                    if(!stack.empty() && stack.peek()==arr[move][j]) {
                        stack.pop();
                        result += 2;
                    } else {
                        stack.push(arr[move][j]);
                    }
                    arr[move][j] = 0;
                    break;
                }
            }
        }

        System.out.println(result);
    }

}
