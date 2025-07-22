package com.codingtest.string.case01_06;

import java.util.*;

public class Case01_06_1 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();

        char[] chars = input.toCharArray();

        List<Character> charList = new ArrayList<>();

        for(char c : chars) {

            if(charList.contains(c)) continue;

            charList.add(c);

        }

        char[] a = new char[charList.size()];
        for(int i = 0; i < charList.size(); i++) {
            a[i] = charList.get(i);
        }

        System.out.println(a);
    }

}
