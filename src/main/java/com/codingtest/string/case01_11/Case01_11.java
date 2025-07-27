package com.codingtest.string.case01_11;

import java.util.*;

public class Case01_11 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        char[] chars=input.toCharArray();
        String result="";

        char tmp = 0;
        int cnt = 1;

        for(char c:chars) {
            if(c==tmp){
                cnt++;
            }else{
                if(cnt>1){
                    result+=cnt;
                }
                result+=c;
                cnt=1;
            }
            tmp = c;
        }
        if(cnt>1){
            result+=cnt;
        }

        System.out.print(result);
    }

}
