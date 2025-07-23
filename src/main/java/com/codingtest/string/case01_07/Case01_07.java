package com.codingtest.string.case01_07;

import java.util.*;

public class Case01_07 {

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        String input = in.next().toLowerCase();

        char[] chars = input.toCharArray();

        int lt = 0;
        int rt = chars.length - 1;

        String result = "YES";

        while(lt<rt){

            if(chars[lt]!=chars[rt]) {
                result = "NO";
                break;
            }
            lt++;
            rt--;

        }

        System.out.println(result);

    }

}
