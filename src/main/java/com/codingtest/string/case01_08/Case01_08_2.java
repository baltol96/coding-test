package com.codingtest.string.case01_08;

import java.util.Scanner;

public class Case01_08_2 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine().toLowerCase();

        String result="NO";

        String tmp = input.replaceAll("[^a-z]", "");
        String reverse = new StringBuilder(tmp).reverse().toString();

        if(tmp.equals(reverse)){
            result="YES";
        }

        System.out.println(result);
    }

}
