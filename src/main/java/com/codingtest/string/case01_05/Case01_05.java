package com.codingtest.string.case01_05;

import java.util.*;

public class Case01_05 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String input = in.next();

        char[] chars=input.toCharArray();

        int lt = 0;
        int rt = chars.length-1;

        while(lt<rt) {
            if(!Character.isAlphabetic(chars[lt])) lt++;
            else if(!Character.isAlphabetic(chars[rt])) rt--;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }

        System.out.println(chars);
    }

}
