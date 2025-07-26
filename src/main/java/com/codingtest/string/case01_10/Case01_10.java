package com.codingtest.string.case01_10;

import java.util.*;

public class Case01_10 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        String[] words = input.split(" ");

        char[] chars = words[0].toCharArray();
        char t = words[1].charAt(0);

        int[] result = new int[chars.length];

        int x = 100;
        for(int i = 0; i<chars.length; i++){

            if(chars[i]==t){
                result[i] = 0;
                x = 1;
            }else{
                result[i] = x;
                x++;
            }

        }

        int y = 100;
        for(int i = chars.length-1; i>=0; i--){

            if(chars[i]==t){
                y = 1;
            }else{
                if(result[i]>y){
                    result[i] = y;
                }
                y++;
            }

        }

        for (int j : result) {
            System.out.print(j + " ");
        }
    }

}
