package com.codingtest.string.case01_09;

import java.util.*;

public class Case01_09 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        String s = "";

        for(char c:input.toCharArray()) {
            if(Character.isDigit(c)) s += c;
        }

        System.out.println(Integer.parseInt(s));
    }

}
