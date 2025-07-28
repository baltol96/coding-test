package com.codingtest.string.case01_12;

import java.util.*;

public class Case01_12 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int count = in.nextInt();
        String input = in.next();

        String output = "";
        for(int i=0;i<count;i++){
            String binary = input.substring(0, 7).replace('#', '1').replace('*','0');
            output += (char) Integer.parseInt(binary,2);
            input = input.substring(7);
        }

        System.out.println(output);
    }

}
