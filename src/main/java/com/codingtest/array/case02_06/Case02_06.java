package com.codingtest.array.case02_06;

import java.util.*;

public class Case02_06 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String result = "";

        List<Integer> array = new ArrayList<>();
        for(int i=0; i < n; i++){
            String b=in.next();
            int tmp = Integer.parseInt(new StringBuilder(b).reverse().toString());
            if(tmp != 0 && tmp != 1){
                array.add(tmp);
            }
        }

        for (int j : array) {
            if (isPrime(j)) {
                result += j + " ";
            }
        }

        System.out.println(result);
    }

    static boolean isPrime(int n){
        int sqrt = (int) Math.sqrt(n);
        for(int i=2; i <= sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

}
