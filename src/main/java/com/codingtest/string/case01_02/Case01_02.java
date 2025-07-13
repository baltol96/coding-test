package com.codingtest.string.case01_02;

import java.util.Scanner;

public class Case01_02 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String input1 = in.next();

        String result = "";

        for(char c : input1.toCharArray()) {
            if(Character.isUpperCase(c)){
                result += Character.toLowerCase(c);
            }else{
                result += Character.toUpperCase(c);
            }
        }

        System.out.println(result);
    }

}
