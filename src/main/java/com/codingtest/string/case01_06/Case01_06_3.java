package com.codingtest.string.case01_06;

import java.util.*;

public class Case01_06_3 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();

        Set<Character> charSet = new LinkedHashSet<>();

        for(char c : input.toCharArray()) {
            //List의 charList.contains(c)은 O(n)의 시간 복잡도 발생
            //Set의 중복 자동 제거
            //LinkedHashSet의 순서 유지
            //O(1) 수준의 시간 복잡도 유지
            charSet.add(c);
        }

        char[] result = new char[charSet.size()];
        int i = 0;
        for(char c : charSet) {
            result[i++] = c;
        }

        System.out.println(result);
    }

}
