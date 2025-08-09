package com.codingtest.array.case02_12;

import java.util.*;

public class Case02_12 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int N = in.nextInt(); // 학생 수
        int M = in.nextInt(); // 시험 수

        int[][] rank = new int[M][N + 1];

        for (int t = 0; t < M; t++) {
            for (int r = 1; r <= N; r++) {
                int student = in.nextInt();
                rank[t][student] = r;
            }
        }

        int answer = 0;

        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                if (a == b) continue;

                boolean ok = true;
                for (int t = 0; t < M; t++) {
                    if (!(rank[t][a] < rank[t][b])) {
                        ok = false;
                        break;
                    }
                }
                if (ok) answer++;
            }
        }

        System.out.println(answer);

    }

}
