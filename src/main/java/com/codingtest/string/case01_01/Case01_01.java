package com.codingtest.string.case01_01;

import java.util.Scanner;

public class Case01_01 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine().toLowerCase();
        String input2 = in.nextLine();
        int result = 0;

        for(char c : input2.toCharArray()){
            if(input1.equals(String.valueOf(c))){
                result++;
            }
        }

        System.out.println(result);
    }
}
