package com.codingtest.two_pointers.case03_02;

import java.util.*;

public class Case03_02_2 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String result = "";

        Set<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            set.add(a[i]);
        }

        int m = in.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=in.nextInt();
        }

        List<Integer> resultList = new ArrayList<>();
        for(int i=0;i<m;i++){
            if(set.contains(b[i])) resultList.add(b[i]);
        }

        Collections.sort(resultList);
        for (Integer integer : resultList) {
            result += integer + " ";
        }

        System.out.println(result);

    }

}
