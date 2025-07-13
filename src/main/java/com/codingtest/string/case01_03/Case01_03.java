package com.codingtest.string.case01_03;

import java.util.*;

public class Case01_03 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();

        String result = "";
        int length = 0;

        String[] words = input1.split(" ");

        for(String word : words){
            if(word.length() > length){
                result = word;
                length = word.length();
            }
        }

        System.out.println(result);
    }

}
