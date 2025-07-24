package com.codingtest.string.case01_08;

import java.util.*;

public class Case01_08_1 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine().toLowerCase();

        char[] chars=input.toCharArray();

        int lt = 0;
        int rt = chars.length-1;

        String result="YES";

        while(lt<rt) {

            boolean isLtAlp = Character.isAlphabetic(chars[lt]);
            boolean isRtAlp = Character.isAlphabetic(chars[rt]);

            if(!isLtAlp) {
                lt++;
            }
            if(!isRtAlp) {
                rt--;
            }
            if(isLtAlp && isRtAlp) {
                if (chars[lt] != chars[rt]) {
                    result = "NO";
                    break;
                }
                lt++;
                rt--;
            }

        }

        System.out.println(result);
    }

}
