package com.codingtest.string.case01_06;

import java.util.*;

public class Case01_06_2 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();

        String result = "";

        for(int i=0;i<input.length();i++){
            if(input.indexOf(input.charAt(i)) == i) {
                //.indexOf()는 같은 문자가 여러 개 있을때 제일 앞의 index를 가져온다
                //그래서 현재 문자의 .indexOf()가 반복문의 현재 순서(i)와 같으면 해당 문자의 첫번째로 볼 수 있다
                result += input.charAt(i);
            }
        }

        System.out.println(result);
    }

}
